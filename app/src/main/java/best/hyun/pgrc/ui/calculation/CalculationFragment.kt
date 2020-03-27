package best.hyun.pgrc.ui.calculation

import android.app.Activity
import android.app.AlertDialog
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.util.DisplayMetrics
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.inputmethod.InputMethodManager
import android.widget.*
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import best.hyun.pgrc.PetFactory
import best.hyun.pgrc.R
import best.hyun.pgrc.logd
import best.hyun.pgrc.type.*
import best.hyun.pgrc.type.yangiro.Yangiro
import com.google.android.gms.ads.AdRequest
import com.google.android.gms.ads.AdSize
import com.google.android.gms.ads.AdView
import com.google.android.gms.ads.MobileAds
import com.google.android.material.textfield.TextInputEditText
import kotlinx.android.synthetic.main.item_collection.view.*

class CalculationFragment : Fragment() {

    private val TAG = "CalculationFragment"

    private lateinit var adViewContainer:FrameLayout

    private lateinit var calculationViewModel: CalculationViewModel

    private lateinit var constraint:ConstraintLayout

    private lateinit var spinner: Spinner
    private lateinit var textName: TextView

    private lateinit var textMainElemental: TextView
    private lateinit var textSubElemental: TextView

    private lateinit var textMainElementalValue: TextView
    private lateinit var textSubElementalValue: TextView

    private lateinit var editInitLv:TextInputEditText
    private lateinit var editInitHp:EditText
    private lateinit var editInitAtk:EditText
    private lateinit var editInitDef:EditText
    private lateinit var editInitSpd:EditText

    private lateinit var editNowLv:EditText
    private lateinit var editNowHp:EditText
    private lateinit var editNowAtk:EditText
    private lateinit var editNowDef:EditText
    private lateinit var editNowSpd:EditText

    private lateinit var petMaxGrowth:TextView
    private lateinit var petMaxHp:TextView
    private lateinit var petMaxAtk:TextView
    private lateinit var petMaxDef:TextView
    private lateinit var petMaxSpd:TextView

    private lateinit var textGrowth:TextView
    private lateinit var textGrowthHp:TextView
    private lateinit var textGrowthAtk:TextView
    private lateinit var textGrowthDef:TextView
    private lateinit var textGrowthSpd:TextView

    private lateinit var resultGrowth:TextView
    private lateinit var resultGrowthHp:TextView
    private lateinit var resultGrowthAtk:TextView
    private lateinit var resultGrowthDef:TextView
    private lateinit var resultGrowthSpd:TextView

    private lateinit var recycler: RecyclerView

    private lateinit var petTypeList: Array<PET_TYPE>
    private lateinit var typePets:Array<Pet>
    private lateinit var typePetNames:Array<CharSequence>
    private lateinit var currentPet: Pet

    private var initialLayoutComplete = false
    private lateinit var adView: AdView

    private val adSize: AdSize
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
        calculationViewModel = ViewModelProviders.of(this).get(CalculationViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_calculation, container, false)

        MobileAds.initialize(requireContext()) {}
        adView = AdView(requireContext())

        constraint = root.findViewById(R.id.constraint_calculation)

        adViewContainer = root.findViewById(R.id.adView_container_calculation)
        adViewContainer.addView(adView)
        adViewContainer.viewTreeObserver.addOnGlobalLayoutListener {
            if(!initialLayoutComplete) {
                initialLayoutComplete = true
                loadBanner()
            }
        }

        spinner = root.findViewById(R.id.spinner_kind_pet_calculation)
        textName = root.findViewById(R.id.text_name_calculation)

        textMainElemental = root.findViewById(R.id.text_main_elemental_calculation)
        textSubElemental = root.findViewById(R.id.text_sub_elemental_calculation)

        textMainElementalValue = root.findViewById(R.id.text_main_elemental_value_calculation)
        textSubElementalValue = root.findViewById(R.id.text_sub_elemental_value_calculation)

        editInitLv  = root.findViewById(R.id.edit_initlv_calculation)
        editInitHp = root.findViewById(R.id.edit_inithp_calculation)
        editInitAtk = root.findViewById(R.id.edit_initatk_calculation)
        editInitDef = root.findViewById(R.id.edit_initdef_calculation)
        editInitSpd = root.findViewById(R.id.edit_initspd_calculation)

        editNowLv = root.findViewById(R.id.edit_nowlv_calculation)
        editNowHp = root.findViewById(R.id.edit_nowhp_calculation)
        editNowAtk = root.findViewById(R.id.edit_nowatk_calculation)
        editNowDef = root.findViewById(R.id.edit_nowdef_calculation)
        editNowSpd = root.findViewById(R.id.edit_nowspd_calculation)

        petMaxGrowth = root.findViewById(R.id.text_petgrowth_calculation)
        petMaxHp = root.findViewById(R.id.text_pethp_calculation)
        petMaxAtk = root.findViewById(R.id.text_petatk_calculation)
        petMaxDef = root.findViewById(R.id.text_petdef_calculation)
        petMaxSpd = root.findViewById(R.id.text_petspd_calculation)

        textGrowth = root.findViewById(R.id.text_growthtotal_calculation)
        textGrowthHp = root.findViewById(R.id.text_growthhp_calculation)
        textGrowthAtk = root.findViewById(R.id.text_growthatk_calculation)
        textGrowthDef = root.findViewById(R.id.text_growthdef_calculation)
        textGrowthSpd = root.findViewById(R.id.text_growthspd_calculation)

        resultGrowth = root.findViewById(R.id.text_resultgrowth_calculation)
        resultGrowthHp = root.findViewById(R.id.text_resulthp_calculation)
        resultGrowthAtk = root.findViewById(R.id.text_resultatk_calculation)
        resultGrowthDef = root.findViewById(R.id.text_resultdef_calculation)
        resultGrowthSpd = root.findViewById(R.id.text_resultspd_calculation)

        recycler = root.findViewById(R.id.recycler_calculation)

        setObserver()

        return root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        constraint.setOnClickListener {hideKeyBoard()}
        setTextChangedListener()

        petTypeList = PetFactory.getPetTypes()
        typePets = PetFactory.getTypePets(petTypeList[0])
        typePetNames = PetFactory.getTypePetNames(petTypeList[0])
        currentPet = typePets[0]

        recycler.adapter = CalculationAdapter()
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
                (recycler.adapter as CalculationFragment.CalculationAdapter).notifyDataSetChanged()
                showPetsDialog(typePets)
            }
        }

        setMAXData(currentPet)
    }

    override fun onDestroyView() {
        hideKeyBoard()
        super.onDestroyView()
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
        adView.adUnitId = getString(R.string.banner_ad_unit_id)
        adView.adSize = adSize

        val adRequest = AdRequest.Builder().build()
        adView.loadAd(adRequest)
    }

    private fun hideKeyBoard() {
        val im = requireActivity().getSystemService(Activity.INPUT_METHOD_SERVICE) as InputMethodManager
        im.hideSoftInputFromWindow(requireActivity().currentFocus?.windowToken, 0)
    }

    private fun setObserver() {
        calculationViewModel.name.observe(this, Observer { textName.text = it })

        calculationViewModel.mainElemental.observe(this, Observer {
            textMainElemental.text =when(it) {
                ELEMENTAL.EARTH -> {
                    textMainElemental.setTextColor(ELEMENTAL_COLOR.EARTH.rgb)
                    textMainElementalValue.setTextColor(ELEMENTAL_COLOR.EARTH.rgb)
                    "地"
                }
                ELEMENTAL.WATER -> {
                    textMainElemental.setTextColor(ELEMENTAL_COLOR.WATER.rgb)
                    textMainElementalValue.setTextColor(ELEMENTAL_COLOR.WATER.rgb)
                    "水"
                }
                ELEMENTAL.FIRE -> {
                    textMainElemental.setTextColor(ELEMENTAL_COLOR.FIRE.rgb)
                    textMainElementalValue.setTextColor(ELEMENTAL_COLOR.FIRE.rgb)
                    "火"
                }
                ELEMENTAL.WIND -> {
                    textMainElemental.setTextColor(ELEMENTAL_COLOR.WIND.rgb)
                    textMainElementalValue.setTextColor(ELEMENTAL_COLOR.WIND.rgb)
                    "風"
                }
            }
        })
        calculationViewModel.subElemental.observe(this, Observer {
            textSubElemental.text = when(it) {
                ELEMENTAL.EARTH -> {
                    textSubElemental.setTextColor(ELEMENTAL_COLOR.EARTH.rgb)
                    textSubElementalValue.setTextColor(ELEMENTAL_COLOR.EARTH.rgb)
                    "地"
                }
                ELEMENTAL.WATER -> {
                    textSubElemental.setTextColor(ELEMENTAL_COLOR.WATER.rgb)
                    textSubElementalValue.setTextColor(ELEMENTAL_COLOR.WATER.rgb)
                    "水"
                }
                ELEMENTAL.FIRE -> {
                    textSubElemental.setTextColor(ELEMENTAL_COLOR.FIRE.rgb)
                    textSubElementalValue.setTextColor(ELEMENTAL_COLOR.FIRE.rgb)
                    "火"
                }
                ELEMENTAL.WIND -> {
                    textSubElemental.setTextColor(ELEMENTAL_COLOR.WIND.rgb)
                    textSubElementalValue.setTextColor(ELEMENTAL_COLOR.WIND.rgb)
                    "風"
                }
                else -> {
                    null
                }
            }
        })
        calculationViewModel.mainElementalValue.observe(this, Observer { textMainElementalValue.text = it.toString() })
        calculationViewModel.subElementalValue.observe(this, Observer {
            if(it == 0)
                textSubElementalValue.text = null
            else
                textSubElementalValue.text = it.toString()
        })

        calculationViewModel.initLv.observe(this, Observer {
            calculationViewModel.growthHp.value = calStatGrowth(calculationViewModel.initLv.value, calculationViewModel.nowLv.value, calculationViewModel.initHp.value, calculationViewModel.nowHp.value)
            calculationViewModel.growthAtk.value = calStatGrowth(calculationViewModel.initLv.value, calculationViewModel.nowLv.value, calculationViewModel.initAtk.value, calculationViewModel.nowAtk.value)
            calculationViewModel.growthDef.value = calStatGrowth(calculationViewModel.initLv.value, calculationViewModel.nowLv.value, calculationViewModel.initDef.value, calculationViewModel.nowDef.value)
            calculationViewModel.growthSpd.value = calStatGrowth(calculationViewModel.initLv.value, calculationViewModel.nowLv.value, calculationViewModel.initSpd.value, calculationViewModel.nowSpd.value)
            calculationViewModel.growth.value = calGrowth(calculationViewModel.growthAtk.value, calculationViewModel.growthDef.value, calculationViewModel.growthSpd.value)
            setResult()
        })

        calculationViewModel.nowLv.observe(this, Observer {
            calculationViewModel.growthHp.value = calStatGrowth(calculationViewModel.initLv.value, calculationViewModel.nowLv.value, calculationViewModel.initHp.value, calculationViewModel.nowHp.value)
            calculationViewModel.growthAtk.value = calStatGrowth(calculationViewModel.initLv.value, calculationViewModel.nowLv.value, calculationViewModel.initAtk.value, calculationViewModel.nowAtk.value)
            calculationViewModel.growthDef.value = calStatGrowth(calculationViewModel.initLv.value, calculationViewModel.nowLv.value, calculationViewModel.initDef.value, calculationViewModel.nowDef.value)
            calculationViewModel.growthSpd.value = calStatGrowth(calculationViewModel.initLv.value, calculationViewModel.nowLv.value, calculationViewModel.initSpd.value, calculationViewModel.nowSpd.value)
            calculationViewModel.growth.value = calGrowth(calculationViewModel.growthAtk.value, calculationViewModel.growthDef.value, calculationViewModel.growthSpd.value)
            setResult()
        })

        calculationViewModel.petMaxGrowth.observe(this, Observer {
            petMaxGrowth.text = it
            setResult()
        })
        calculationViewModel.petMaxHp.observe(this, Observer {
            petMaxHp.text = it
            setResult()
        })
        calculationViewModel.petMaxAtk.observe(this, Observer {
            petMaxAtk.text = it
            setResult()
        })
        calculationViewModel.petMaxDef.observe(this, Observer {
            petMaxDef.text = it
            setResult()
        })
        calculationViewModel.petMaxSpd.observe(this, Observer {
            petMaxSpd.text = it
            setResult()
        })

        calculationViewModel.growth.observe(this, Observer {
            textGrowth.text = it
            setResult()
        })
        calculationViewModel.growthHp.observe(this, Observer {
            textGrowthHp.text = it
            setResult()
        })
        calculationViewModel.growthAtk.observe(this, Observer {
            textGrowthAtk.text = it
            calculationViewModel.growth.value = calGrowth(calculationViewModel.growthAtk.value, calculationViewModel.growthDef.value, calculationViewModel.growthSpd.value)
            setResult()
        })

        calculationViewModel.growthDef.observe(this, Observer {
            textGrowthDef.text = it
            calculationViewModel.growth.value = calGrowth(calculationViewModel.growthAtk.value, calculationViewModel.growthDef.value, calculationViewModel.growthSpd.value)
            setResult()
        })

        calculationViewModel.growthSpd.observe(this, Observer {
            textGrowthSpd.text = it
            calculationViewModel.growth.value = calGrowth(calculationViewModel.growthAtk.value, calculationViewModel.growthDef.value, calculationViewModel.growthSpd.value)
            setResult()
        })

        calculationViewModel.resultGrowth.observe(this, Observer { resultGrowth.text = it })
        calculationViewModel.resultGrowthHp.observe(this, Observer { resultGrowthHp.text = it })
        calculationViewModel.resultGrowthAtk.observe(this, Observer { resultGrowthAtk.text = it })
        calculationViewModel.resultGrowthDef.observe(this, Observer { resultGrowthDef.text = it })
        calculationViewModel.resultGrowthSpd.observe(this, Observer { resultGrowthSpd.text = it })

        calculationViewModel.initHp.observe(this, Observer {
            calculationViewModel.growthHp.value = calStatGrowth(calculationViewModel.initLv.value, calculationViewModel.nowLv.value, calculationViewModel.initHp.value, calculationViewModel.nowHp.value)
            setResult()
        })
        calculationViewModel.initAtk.observe(this, Observer {
            calculationViewModel.growthAtk.value = calStatGrowth(calculationViewModel.initLv.value, calculationViewModel.nowLv.value, calculationViewModel.initAtk.value, calculationViewModel.nowAtk.value)
            setResult()
        })
        calculationViewModel.initDef.observe(this, Observer {
            calculationViewModel.growthDef.value = calStatGrowth(calculationViewModel.initLv.value, calculationViewModel.nowLv.value, calculationViewModel.initDef.value, calculationViewModel.nowDef.value)
            setResult()
        })
        calculationViewModel.initSpd.observe(this, Observer {
            calculationViewModel.growthSpd.value = calStatGrowth(calculationViewModel.initLv.value, calculationViewModel.nowLv.value, calculationViewModel.initSpd.value, calculationViewModel.nowSpd.value)
            setResult()
        })

        calculationViewModel.nowHp.observe(this, Observer {
            calculationViewModel.growthHp.value = calStatGrowth(calculationViewModel.initLv.value, calculationViewModel.nowLv.value, calculationViewModel.initHp.value, calculationViewModel.nowHp.value)
            setResult()
        })
        calculationViewModel.nowAtk.observe(this, Observer {
            calculationViewModel.growthAtk.value = calStatGrowth(calculationViewModel.initLv.value, calculationViewModel.nowLv.value, calculationViewModel.initAtk.value, calculationViewModel.nowAtk.value)
            setResult()
        })
        calculationViewModel.nowDef.observe(this, Observer {
            calculationViewModel.growthDef.value = calStatGrowth(calculationViewModel.initLv.value, calculationViewModel.nowLv.value, calculationViewModel.initDef.value, calculationViewModel.nowDef.value)
            setResult()
        })
        calculationViewModel.nowSpd.observe(this, Observer {
            calculationViewModel.growthSpd.value = calStatGrowth(calculationViewModel.initLv.value, calculationViewModel.nowLv.value, calculationViewModel.initSpd.value, calculationViewModel.nowSpd.value)
            setResult()
        })
    }

    private fun calStatGrowth(initLv:Int?, nowLv:Int?, initStat:Int?, nowStat:Int?): String? {
        if(initLv != null && nowLv != null && initStat != null && nowStat != null) {
            return String.format("%.3f",(nowStat - initStat).toDouble() / (nowLv - initLv).toDouble())
        } else {
            return null
        }
    }

    private fun calGrowth(atk:String?, def:String?, spd:String?): String? {
        if(atk != null && def != null && spd != null) {
            return String.format("%.3f",(atk.toDouble() + def.toDouble() + spd.toDouble()))
        } else {
            return null
        }
    }

    private fun calDiffStat(max:String?, now:String?):String? {
        if(max != null && now != null) {
            if(max.toDouble() > now.toDouble())
                return String.format("-%.3f", (max.toDouble() - now.toDouble()))
            else
                return String.format("+%.3f", (now.toDouble() - max.toDouble()))
        } else {
            return null
        }
    }

    private fun setResult() {
//        resultGrowth.text = calDiffStat(currentPet.maxAllGrowth.toString(), calculationViewModel.growth.value)
//        resultGrowthHp.text = calDiffStat(currentPet.maxHpGrowth.toString(), calculationViewModel.growthHp.value)
//        resultGrowthAtk.text = calDiffStat(currentPet.maxAtkGrowth.toString(), calculationViewModel.growthAtk.value)
//        resultGrowthDef.text = calDiffStat(currentPet.maxDefGrowth.toString(), calculationViewModel.growthDef.value)
//        resultGrowthSpd.text = calDiffStat(currentPet.maxSpdGrowth.toString(), calculationViewModel.growthSpd.value)

        resultGrowth.apply {
            text = calDiffStat(currentPet.maxAllGrowth.toString(), calculationViewModel.growth.value)
            if(text.contains("-"))
                setTextColor(ELEMENTAL_COLOR.FIRE.rgb)
            else if (text.contains("+"))
                setTextColor(ELEMENTAL_COLOR.WATER.rgb)
        }

        resultGrowthHp.apply {
            text = calDiffStat(currentPet.maxHpGrowth.toString(), calculationViewModel.growthHp.value)
            if(text.contains("-"))
                setTextColor(ELEMENTAL_COLOR.FIRE.rgb)
            else if (text.contains("+"))
                setTextColor(ELEMENTAL_COLOR.WATER.rgb)
        }

        resultGrowthAtk.apply {
            text = calDiffStat(currentPet.maxAtkGrowth.toString(), calculationViewModel.growthAtk.value)
            if(text.contains("-"))
                setTextColor(ELEMENTAL_COLOR.FIRE.rgb)
            else if (text.contains("+"))
                setTextColor(ELEMENTAL_COLOR.WATER.rgb)
        }

        resultGrowthDef.apply {
            text = calDiffStat(currentPet.maxDefGrowth.toString(), calculationViewModel.growthDef.value)
            if(text.contains("-"))
                setTextColor(ELEMENTAL_COLOR.FIRE.rgb)
            else if (text.contains("+"))
                setTextColor(ELEMENTAL_COLOR.WATER.rgb)
        }

        resultGrowthSpd.apply {
            text = calDiffStat(currentPet.maxSpdGrowth.toString(), calculationViewModel.growthSpd.value)
            if(text.contains("-"))
                setTextColor(ELEMENTAL_COLOR.FIRE.rgb)
            else if (text.contains("+"))
                setTextColor(ELEMENTAL_COLOR.WATER.rgb)
        }
    }

    private fun setTextChangedListener() {
        editInitLv.addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {}
            override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {}
            override fun afterTextChanged(p0: Editable?) {
                if(p0.toString().equals(""))
                    calculationViewModel.initLv.value = null
                else
                    calculationViewModel.initLv.value = p0.toString().toInt()
            }
        })

        editInitHp.addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {}
            override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {}
            override fun afterTextChanged(p0: Editable?) {
                if(p0.toString().equals(""))
                    calculationViewModel.initHp.value = null
                else
                    calculationViewModel.initHp.value = p0.toString().toInt()
            }
        })

        editInitAtk.addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {}
            override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {}
            override fun afterTextChanged(p0: Editable?) {
                if(p0.toString().equals(""))
                    calculationViewModel.initAtk.value = null
                else
                    calculationViewModel.initAtk.value = p0.toString().toInt()
            }
        })

        editInitDef.addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {}
            override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {}
            override fun afterTextChanged(p0: Editable?) {
                if(p0.toString().equals(""))
                    calculationViewModel.initDef.value = null
                else
                    calculationViewModel.initDef.value = p0.toString().toInt()
            }
        })

        editInitSpd.addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {}
            override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {}
            override fun afterTextChanged(p0: Editable?) {
                if(p0.toString().equals(""))
                    calculationViewModel.initSpd.value = null
                else
                    calculationViewModel.initSpd.value = p0.toString().toInt()
            }
        })


        editNowLv.addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {}
            override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {}
            override fun afterTextChanged(p0: Editable?) {
                if(p0.toString().equals(""))
                    calculationViewModel.nowLv.value = null
                else
                    calculationViewModel.nowLv.value = p0.toString().toInt()
            }
        })

        editNowHp.addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {}
            override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {}
            override fun afterTextChanged(p0: Editable?) {
                if(p0.toString().equals(""))
                    calculationViewModel.nowHp.value = null
                else
                    calculationViewModel.nowHp.value = p0.toString().toInt()
            }
        })

        editNowAtk.addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {}
            override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {}
            override fun afterTextChanged(p0: Editable?) {
                if(p0.toString().equals(""))
                    calculationViewModel.nowAtk.value = null
                else
                    calculationViewModel.nowAtk.value = p0.toString().toInt()
            }
        })

        editNowDef.addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {}
            override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {}
            override fun afterTextChanged(p0: Editable?) {
                if(p0.toString().equals(""))
                    calculationViewModel.nowDef.value = null
                else
                    calculationViewModel.nowDef.value = p0.toString().toInt()
            }
        })

        editNowSpd.addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {}
            override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {}
            override fun afterTextChanged(p0: Editable?) {
                if(p0.toString().equals(""))
                    calculationViewModel.nowSpd.value = null
                else
                    calculationViewModel.nowSpd.value = p0.toString().toInt()
            }
        })
    }

    private fun setMAXData(pet:Pet) {
        calculationViewModel.name.value = pet.name

        calculationViewModel.mainElemental.value = pet.mainElemental
        calculationViewModel.subElemental.value = pet.subElemental

        calculationViewModel.mainElementalValue.value = pet.mainElementalValue
        calculationViewModel.subElementalValue.value = pet.subElementalValue

        calculationViewModel.petMaxHp.value = String.format("%d", pet.maxLvMaxHp)
        calculationViewModel.petMaxAtk.value = String.format("%d", pet.maxLvMaxAtk)
        calculationViewModel.petMaxDef.value = String.format("%d", pet.maxLvMaxDef)
        calculationViewModel.petMaxSpd.value = String.format("%d", pet.maxLvMaxSpd)
        calculationViewModel.petMaxGrowth.value = String.format("%.3f", pet.maxAllGrowth)
    }

    private fun showPetsDialog(selectedTypePets:Array<Pet>) {
        val builder = AlertDialog.Builder(requireContext())
//        builder.setTitle(getString(R.string.title_dialog))
            .setItems(typePetNames) { _, pos ->
                currentPet = selectedTypePets[pos]
                setMAXData(currentPet)
            }

        val dialog = builder.create()
        dialog.show()
    }

    inner class CalculationAdapter: RecyclerView.Adapter<CalculationAdapter.ViewHolder>() {

        override fun getItemCount(): Int = typePets.size

        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
            val viewHolder = LayoutInflater.from(requireContext()).inflate(R.layout.item_collection, parent,false)

            return ViewHolder(viewHolder)
        }

        override fun onBindViewHolder(holder: ViewHolder, position: Int) {
            holder.item.text = typePets[position].name
            holder.item.setOnClickListener {
                currentPet = typePets[position]
                setMAXData(currentPet)
            }
        }

        inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
            val item = itemView.btn_collection_i
        }
    }
}