package best.hyun.pgrc.ui.collection

import android.graphics.Color
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.*
import androidx.fragment.app.Fragment
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import best.hyun.pgrc.R
import best.hyun.pgrc.logd
import best.hyun.pgrc.type.*
import best.hyun.pgrc.type.ELEMENTAL.*
import best.hyun.pgrc.type.yangiro.Libino
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textfield.TextInputLayout

class CollectionFragment : Fragment() {

    private val TAG = "CollectionFragment"

    private lateinit var collectionViewModel: CollectionViewModel

//    private lateinit var editName: EditText
//    private lateinit var editName: AutoCompleteTextView
//    private lateinit var editName: TextInputEditText
    private lateinit var spinner:Spinner
    private lateinit var textName: TextView

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

    private lateinit var btnSearch:ImageButton

    private var petList = arrayOf("얀기로", "리비노", "반보로", "반기노", "부르돈", "얀기로", "리비노", "반보로", "반기노", "부르돈", "얀기로", "리비노", "반보로", "반기노", "부르돈", "얀기로", "리비노", "반보로", "반기노", "부르돈", "얀기로", "리비노", "반보로", "반기노", "부르돈")

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        collectionViewModel =
            ViewModelProviders.of(this).get(CollectionViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_collection, container, false)

//        editName = root.findViewById(R.id.edit_kind_pet_collection)
//        editName = root.findViewById(R.id.edit_pet_name_collection)
//        editName.setAdapter(ArrayAdapter<String>(requireContext(), android.R.layout.simple_dropdown_item_1line, arrayOf("100","200", "300")))
        spinner = root.findViewById(R.id.edit_kind_pet_collection)
        val adapter = ArrayAdapter<String>(requireContext(), R.layout.custom_simple_dropdown_item_1line, petList)
        adapter.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line)
        spinner.adapter = adapter

        spinner.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onNothingSelected(parent: AdapterView<*>?) {}

            override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
                when(position) {
                    0 -> {
                        setData(PetFactory.getPet(YangiroFactory()))
                    }
                    1 -> {
                        setData(PetFactory.getPet(LibinoFactory()))
                    }
                }
            }
        }

        textName = root.findViewById(R.id.text_name_collection)

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

//        var yangiro: Pet
//        btnSearch = root.findViewById(R.id.btn_search_collection)
//        btnSearch.setOnClickListener {
//            yangiro = PetFactory.getPet(YangiroFactory())
//            setData(yangiro)
//        }

        setObserver()



        return root
    }

    fun setObserver() {
        collectionViewModel.name.observe(this, Observer { textName.text = it })

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

    fun setData(pet:Pet) {
        collectionViewModel.name.value = pet.name

        collectionViewModel.mainElemental.value = pet.mainElemental
        collectionViewModel.subElemental.value = pet.subElemental

        collectionViewModel.mainElementalValue.value = pet.mainElementalValue
        collectionViewModel.subElementalValue.value = pet.subElementalValue

        collectionViewModel.initLv.value = pet.initLv.toString()
        collectionViewModel.maxLv.value = pet.maxLv.toString()
        collectionViewModel.growth.value = getString(R.string.text_growth)

        collectionViewModel.initHp.value = String.format("%d ~ %d", pet.initLvMinHp, pet.initLvMaxHp)
        collectionViewModel.initAtk.value = String.format("%d ~ %d", pet.initLvMinAtk, pet.initLvMaxAtk)
        collectionViewModel.initDef.value = String.format("%d ~ %d", pet.initLvMinDef, pet.initLvMaxDef)
        collectionViewModel.initSpd.value = String.format("%d ~ %d", pet.initLvMinSpd, pet.initLvMaxSpd)

        collectionViewModel.maxHp.value = String.format("%d ~ %d", pet.maxLvMinHp, pet.maxLvMaxHp)
        collectionViewModel.maxAtk.value = String.format("%d ~ %d", pet.maxLvMinAtk, pet.maxLvMaxAtk)
        collectionViewModel.maxDef.value = String.format("%d ~ %d", pet.maxLvMinDef, pet.maxLvMaxDef)
        collectionViewModel.maxSpd.value = String.format("%d ~ %d", pet.maxLvMinSpd, pet.maxLvMaxSpd)

        collectionViewModel.growthHp.value = String.format("%.3f ~ %.3f", pet.minHpGrowth, pet.maxHpGrowth)
        collectionViewModel.growthAtk.value = String.format("%.3f ~ %.3f", pet.minAtkGrowth, pet.maxAtkGrowth)
        collectionViewModel.growthDef.value = String.format("%.3f ~ %.3f", pet.minDefGrowth, pet.maxDefGrowth)
        collectionViewModel.growthSpd.value = String.format("%.3f ~ %.3f", pet.minSpdGrowth, pet.maxSpdGrowth)
        collectionViewModel.growthAll.value = String.format("%.3f ~ %.3f", pet.minAllGrowth, pet.maxAllGrowth)
    }
}
