package best.hyun.pgrc.ui.collection

import android.app.AlertDialog
import android.os.Bundle
import android.util.DisplayMetrics
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.*
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import best.hyun.pgrc.App
import best.hyun.pgrc.PetFactory
import best.hyun.pgrc.R
import best.hyun.pgrc.logd
import best.hyun.pgrc.type.*
import best.hyun.pgrc.type.ELEMENTAL.*
import com.google.android.gms.ads.*
import kotlinx.android.synthetic.main.fragment_collection.*
import kotlinx.android.synthetic.main.item_collection.view.*


enum class VIEWSTATE(val state:String) {
    MIN(App.getString(R.string.text_min)), MAX(App.getString(R.string.text_max)), ALL(App.getString(R.string.text_all))
}

class CollectionFragment : Fragment() {

    private val TAG = "CollectionFragment"

    private lateinit var collectionViewModel: CollectionViewModel

    private lateinit var adViewContainer: FrameLayout

    private lateinit var spinner:Spinner
    private lateinit var textName: TextView
    private lateinit var btnViewState:Button

    private lateinit var textMainElemental: TextView
    private lateinit var textSubElemental: TextView

    private lateinit var textMainElementalValue: TextView
    private lateinit var textSubElementalValue: TextView

    private lateinit var textInitLv:TextView
    private lateinit var textMaxLv:TextView
    private lateinit var textGrowth:TextView

    private lateinit var textInitHp:TextView
    private lateinit var textInitAtk:TextView
    private lateinit var textInitDef:TextView
    private lateinit var textInitSpd:TextView

    private lateinit var textMaxHp:TextView
    private lateinit var textMaxAtk:TextView
    private lateinit var textMaxDef:TextView
    private lateinit var textMaxSpd:TextView

    private lateinit var growthHp:TextView
    private lateinit var growthAtk:TextView
    private lateinit var growthDef:TextView
    private lateinit var growthSpd:TextView
    private lateinit var growthAll:TextView

    private lateinit var recycler: RecyclerView

    private lateinit var petTypeList: Array<PET_TYPE>
    private lateinit var typePets:Array<Pet>
    private lateinit var typePetNames:Array<CharSequence>
    private lateinit var currentPet:Pet

    private var initialLayoutComplete = false
    private lateinit var adView:AdView

    private val adSize:AdSize
        get() {
            val display = requireActivity().windowManager.defaultDisplay
            val outMetrics = DisplayMetrics()
            display.getMetrics(outMetrics)

            val density = outMetrics.density

            var adWidthPixels = adViewContainer.width.toFloat()
            if(adWidthPixels == 0f) {
                adWidthPixels = outMetrics.widthPixels.toFloat()
            }

            val adWidth = (adWidthPixels / density).toInt()
            return AdSize.getCurrentOrientationAnchoredAdaptiveBannerAdSize(requireContext(), adWidth)
        }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        collectionViewModel =
            ViewModelProviders.of(this).get(CollectionViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_collection, container, false)

        MobileAds.initialize(requireContext()) {}
        adView = AdView(requireContext())

        adViewContainer = root.findViewById(R.id.adView_container_collection)
        adViewContainer.addView(adView)
        adViewContainer.viewTreeObserver.addOnGlobalLayoutListener {
            if(!initialLayoutComplete) {
                initialLayoutComplete = true
                loadBanner()
            }
        }

        spinner = root.findViewById(R.id.edit_kind_pet_collection)

        textName = root.findViewById(R.id.text_name_collection)
        btnViewState = root.findViewById(R.id.btn_state_collection)

        textMainElemental = root.findViewById(R.id.text_main_elemental_collection)
        textSubElemental = root.findViewById(R.id.text_sub_elemental_collection)

        textMainElementalValue = root.findViewById(R.id.text_main_elemental_value_collection)
        textSubElementalValue = root.findViewById(R.id.text_sub_elemental_value_collection)

        textInitLv = root.findViewById(R.id.text_lv_init_collection)
        textMaxLv = root.findViewById(R.id.text_lv_max_collection)
        textGrowth = root.findViewById(R.id.text_growth_min_collection)

        textInitHp = root.findViewById(R.id.text_hp_init_collection)
        textInitAtk = root.findViewById(R.id.text_atk_init_collection)
        textInitDef = root.findViewById(R.id.text_def_init_collection)
        textInitSpd = root.findViewById(R.id.text_spd_init_collection)

        textMaxHp = root.findViewById(R.id.text_hp_max_collection)
        textMaxAtk = root.findViewById(R.id.text_atk_max_collection)
        textMaxDef = root.findViewById(R.id.text_def_max_collection)
        textMaxSpd = root.findViewById(R.id.text_spd_max_collection)

        growthHp = root.findViewById(R.id.text_growth_min_hp_collection)
        growthAtk = root.findViewById(R.id.text_growth_min_atk_collection)
        growthDef = root.findViewById(R.id.text_growth_min_def_collection)
        growthSpd = root.findViewById(R.id.text_growth_min_spd_collection)
        growthAll = root.findViewById(R.id.text_growth_min_all_collection)

        recycler = root.findViewById(R.id.recycler_collection)

        setObserver()

        return root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        petTypeList = PetFactory.getPetTypes()
        typePets = PetFactory.getTypePets(petTypeList[0])
        typePetNames = PetFactory.getTypePetNames(petTypeList[0])
        currentPet = typePets[0]

        recycler.adapter = CollectionAdapter()
        recycler.layoutManager = GridLayoutManager(requireContext(), 3)

        val adapter = ArrayAdapter<PET_TYPE>(requireContext(), R.layout.custom_simple_dropdown_item_1line, petTypeList)
        adapter.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line)
        spinner.adapter = adapter
        spinner.setSelection(0, false)
        spinner.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onNothingSelected(parent: AdapterView<*>?) { logd(TAG, "onNothingSelected(): ${parent.toString()}") }

            override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
                val petType = petTypeList[position]
                typePets = PetFactory.getTypePets(petType)
                typePetNames = PetFactory.getTypePetNames(petType)
                adapter.notifyDataSetChanged()
                (recycler.adapter as CollectionAdapter).notifyDataSetChanged()
//                specificTypePetNames = PetFactory.getTypePetNames2(specificTypePets)
                showPetsDialog(typePets)
            }
        }

        // 최소, 최대, 모두 보기
        collectionViewModel.viewState.value = VIEWSTATE.ALL
        btnViewState.setOnClickListener {
            setViewState(collectionViewModel.viewState.value!!)
            when(collectionViewModel.viewState.value) {
                VIEWSTATE.MIN -> setMINData(currentPet)
                VIEWSTATE.MAX -> setMAXData(currentPet)
                VIEWSTATE.ALL -> setALLData(currentPet)
            }
        }

        // 처음 화면에 보여질 펫
        setALLData(currentPet)
    }

    override fun onPause() {
        adView.pause()
        super.onPause()
    }

    override fun onResume() {
        super.onResume()
        adView.resume()
    }

    override fun onDestroy() {
        adView.destroy()
        super.onDestroy()
    }


    private fun loadBanner() {
        adView.adUnitId = getString(R.string.banner_ad_unit_id_for_test)
        adView.adSize = adSize

        val adRequest = AdRequest.Builder().build()
        adView.loadAd(adRequest)
    }

    private fun setObserver() {
        collectionViewModel.name.observe(this, Observer { textName.text = it })
        collectionViewModel.viewState.observe(this, Observer{ btnViewState.text =  it.state})

        collectionViewModel.mainElemental.observe(this, Observer {
            textMainElemental.text = when(it) {
                EARTH -> {
                    textMainElemental.setTextColor(ELEMENTAL_COLOR.EARTH.rgb)
                    textMainElementalValue.setTextColor(ELEMENTAL_COLOR.EARTH.rgb)
                    "地"
                }
                WATER -> {
                    textMainElemental.setTextColor(ELEMENTAL_COLOR.WATER.rgb)
                    textMainElementalValue.setTextColor(ELEMENTAL_COLOR.WATER.rgb)
                    "水"
                }
                FIRE -> {
                    textMainElemental.setTextColor(ELEMENTAL_COLOR.FIRE.rgb)
                    textMainElementalValue.setTextColor(ELEMENTAL_COLOR.FIRE.rgb)
                    "火"
                }
                WIND -> {
                    textMainElemental.setTextColor(ELEMENTAL_COLOR.WIND.rgb)
                    textMainElementalValue.setTextColor(ELEMENTAL_COLOR.WIND.rgb)
                    "風"
                }
            }
        })
        collectionViewModel.subElemental.observe(this, Observer {
            textSubElemental.text =  when(it) {
                EARTH -> {
                    textSubElemental.setTextColor(ELEMENTAL_COLOR.EARTH.rgb)
                    textSubElementalValue.setTextColor(ELEMENTAL_COLOR.EARTH.rgb)
                    "地"
                }
                WATER -> {
                    textSubElemental.setTextColor(ELEMENTAL_COLOR.WATER.rgb)
                    textSubElementalValue.setTextColor(ELEMENTAL_COLOR.WATER.rgb)
                    "水"
                }
                FIRE -> {
                    textSubElemental.setTextColor(ELEMENTAL_COLOR.FIRE.rgb)
                    textSubElementalValue.setTextColor(ELEMENTAL_COLOR.FIRE.rgb)
                    "火"
                }
                WIND -> {
                    textSubElemental.setTextColor(ELEMENTAL_COLOR.WIND.rgb)
                    textSubElementalValue.setTextColor(ELEMENTAL_COLOR.WIND.rgb)
                    "風"
                }
                else -> {
                    null
                }
            }
        })

        collectionViewModel.mainElementalValue.observe(this, Observer { textMainElementalValue.text = it.toString() })
        collectionViewModel.subElementalValue.observe(this, Observer {
            if(it == 0)
                textSubElementalValue.text = null
            else
                textSubElementalValue.text = it.toString()
        })

        collectionViewModel.initLv.observe(this, Observer { textInitLv.text = it })
        collectionViewModel.maxLv.observe(this, Observer { textMaxLv.text = it })
        collectionViewModel.growth.observe(this, Observer { textGrowth.text = it })

        collectionViewModel.initHp.observe(this, Observer { textInitHp.text = it })
        collectionViewModel.initAtk.observe(this, Observer { textInitAtk.text = it })
        collectionViewModel.initDef.observe(this, Observer { textInitDef.text = it })
        collectionViewModel.initSpd.observe(this, Observer { textInitSpd.text = it })

        collectionViewModel.maxHp.observe(this, Observer{ textMaxHp.text = it })
        collectionViewModel.maxAtk.observe(this, Observer{ textMaxAtk.text = it })
        collectionViewModel.maxDef.observe(this, Observer{ textMaxDef.text = it })
        collectionViewModel.maxSpd.observe(this, Observer{ textMaxSpd.text = it })

        collectionViewModel.growthHp.observe(this, Observer{ growthHp.text = it })
        collectionViewModel.growthAtk.observe(this, Observer{ growthAtk.text = it })
        collectionViewModel.growthDef.observe(this, Observer{ growthDef.text = it })
        collectionViewModel.growthSpd.observe(this, Observer{ growthSpd.text = it })
        collectionViewModel.growthAll.observe(this, Observer{ growthAll.text = it })
    }
    private fun setViewState(viewState:VIEWSTATE) {
        when (viewState) {
            VIEWSTATE.MIN -> { collectionViewModel.viewState.value = VIEWSTATE.MAX }
            VIEWSTATE.MAX -> { collectionViewModel.viewState.value = VIEWSTATE.ALL }
            VIEWSTATE.ALL -> { collectionViewModel.viewState.value = VIEWSTATE.MIN }
        }
    }
    private fun setData(pet:Pet) {
        when(collectionViewModel.viewState.value) {
            VIEWSTATE.MIN -> setMINData(pet)
            VIEWSTATE.MAX -> setMAXData(pet)
            VIEWSTATE.ALL -> setALLData(pet)
        }
    }
    private fun setMINData(pet:Pet) {
        collectionViewModel.name.value = pet.name

        collectionViewModel.mainElemental.value = pet.mainElemental
        collectionViewModel.subElemental.value = pet.subElemental

        collectionViewModel.mainElementalValue.value = pet.mainElementalValue
        collectionViewModel.subElementalValue.value = pet.subElementalValue

        collectionViewModel.initLv.value = pet.initLv.toString()
        collectionViewModel.maxLv.value = pet.maxLv.toString()
        collectionViewModel.growth.value = getString(R.string.text_growth)

        collectionViewModel.initHp.value = String.format("%d", pet.initLvMinHp)
        collectionViewModel.initAtk.value = String.format("%d", pet.initLvMinAtk)
        collectionViewModel.initDef.value = String.format("%d", pet.initLvMinDef)
        collectionViewModel.initSpd.value = String.format("%d", pet.initLvMinSpd)

        collectionViewModel.maxHp.value = String.format("%d", pet.maxLvMinHp)
        collectionViewModel.maxAtk.value = String.format("%d", pet.maxLvMinAtk)
        collectionViewModel.maxDef.value = String.format("%d", pet.maxLvMinDef)
        collectionViewModel.maxSpd.value = String.format("%d", pet.maxLvMinSpd)

        collectionViewModel.growthHp.value = String.format("%.3f", pet.minHpGrowth)
        collectionViewModel.growthAtk.value = String.format("%.3f", pet.minAtkGrowth)
        collectionViewModel.growthDef.value = String.format("%.3f", pet.minDefGrowth)
        collectionViewModel.growthSpd.value = String.format("%.3f", pet.minSpdGrowth)
        collectionViewModel.growthAll.value = String.format("%.3f", pet.minAllGrowth)
    }
    private fun setMAXData(pet:Pet) {
        collectionViewModel.name.value = pet.name

        collectionViewModel.mainElemental.value = pet.mainElemental
        collectionViewModel.subElemental.value = pet.subElemental

        collectionViewModel.mainElementalValue.value = pet.mainElementalValue
        collectionViewModel.subElementalValue.value = pet.subElementalValue

        collectionViewModel.initLv.value = pet.initLv.toString()
        collectionViewModel.maxLv.value = pet.maxLv.toString()
        collectionViewModel.growth.value = getString(R.string.text_growth)

        collectionViewModel.initHp.value = String.format("%d", pet.initLvMaxHp)
        collectionViewModel.initAtk.value = String.format("%d", pet.initLvMaxAtk)
        collectionViewModel.initDef.value = String.format("%d", pet.initLvMaxDef)
        collectionViewModel.initSpd.value = String.format("%d", pet.initLvMaxSpd)

        collectionViewModel.maxHp.value = String.format("%d", pet.maxLvMaxHp)
        collectionViewModel.maxAtk.value = String.format("%d", pet.maxLvMaxAtk)
        collectionViewModel.maxDef.value = String.format("%d", pet.maxLvMaxDef)
        collectionViewModel.maxSpd.value = String.format("%d", pet.maxLvMaxSpd)

        collectionViewModel.growthHp.value = String.format("%.3f", pet.maxHpGrowth)
        collectionViewModel.growthAtk.value = String.format("%.3f", pet.maxAtkGrowth)
        collectionViewModel.growthDef.value = String.format("%.3f", pet.maxDefGrowth)
        collectionViewModel.growthSpd.value = String.format("%.3f", pet.maxSpdGrowth)
        collectionViewModel.growthAll.value = String.format("%.3f", pet.maxAllGrowth)
    }
    private fun setALLData(pet:Pet) {
        collectionViewModel.name.value = pet.name

        collectionViewModel.mainElemental.value = pet.mainElemental
        collectionViewModel.subElemental.value = pet.subElemental

        collectionViewModel.mainElementalValue.value = pet.mainElementalValue
        collectionViewModel.subElementalValue.value = pet.subElementalValue

        collectionViewModel.initLv.value = pet.initLv.toString()
        collectionViewModel.maxLv.value = pet.maxLv.toString()
        collectionViewModel.growth.value = getString(R.string.text_growth)

        collectionViewModel.initHp.value = String.format("%d - %d", pet.initLvMinHp, pet.initLvMaxHp)
        collectionViewModel.initAtk.value = String.format("%d - %d", pet.initLvMinAtk, pet.initLvMaxAtk)
        collectionViewModel.initDef.value = String.format("%d - %d", pet.initLvMinDef, pet.initLvMaxDef)
        collectionViewModel.initSpd.value = String.format("%d - %d", pet.initLvMinSpd, pet.initLvMaxSpd)

        collectionViewModel.maxHp.value = String.format("%d - %d", pet.maxLvMinHp, pet.maxLvMaxHp)
        collectionViewModel.maxAtk.value = String.format("%d - %d", pet.maxLvMinAtk, pet.maxLvMaxAtk)
        collectionViewModel.maxDef.value = String.format("%d - %d", pet.maxLvMinDef, pet.maxLvMaxDef)
        collectionViewModel.maxSpd.value = String.format("%d - %d", pet.maxLvMinSpd, pet.maxLvMaxSpd)

        collectionViewModel.growthHp.value = String.format("%.3f - %.3f", pet.minHpGrowth, pet.maxHpGrowth)
        collectionViewModel.growthAtk.value = String.format("%.3f - %.3f", pet.minAtkGrowth, pet.maxAtkGrowth)
        collectionViewModel.growthDef.value = String.format("%.3f - %.3f", pet.minDefGrowth, pet.maxDefGrowth)
        collectionViewModel.growthSpd.value = String.format("%.3f - %.3f", pet.minSpdGrowth, pet.maxSpdGrowth)
        collectionViewModel.growthAll.value = String.format("%.3f - %.3f", pet.minAllGrowth, pet.maxAllGrowth)
    }
    private fun showPetsDialog(selectedTypePets:Array<Pet>) {
        val builder = AlertDialog.Builder(requireContext())
//        builder.setTitle(getString(R.string.title_dialog))
            .setItems(typePetNames) { _, pos ->
                currentPet = selectedTypePets[pos]
                setData(currentPet)
            }

        val dialog = builder.create()
        dialog.show()
    }

    inner class CollectionAdapter:RecyclerView.Adapter<CollectionAdapter.ViewHolder>() {

        override fun getItemCount(): Int = typePets.size

        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
            val viewHolder = LayoutInflater.from(requireContext()).inflate(R.layout.item_collection, parent,false)

            return ViewHolder(viewHolder)
        }

        override fun onBindViewHolder(holder: ViewHolder, position: Int) {
            holder.item.text = typePets[position].name
            holder.item.setOnClickListener {
                currentPet = typePets[position]
                setData(currentPet)
            }
        }

        inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
            val item = itemView.btn_collection_i
        }
    }

}
