package best.hyun.pgrc.ui.calculation

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import best.hyun.pgrc.type.ELEMENTAL
import best.hyun.pgrc.ui.collection.VIEWSTATE

class CalculationViewModel : ViewModel() {

    val name = MutableLiveData<String>()

    val mainElemental = MutableLiveData<ELEMENTAL>()
    val subElemental = MutableLiveData<ELEMENTAL?>()

    val mainElementalValue = MutableLiveData<Int>()
    val subElementalValue = MutableLiveData<Int>()

    val initLv = MutableLiveData<Int>()
    val initHp = MutableLiveData<Int>()
    val initAtk = MutableLiveData<Int>()
    val initDef = MutableLiveData<Int>()
    val initSpd = MutableLiveData<Int>()

    val nowLv = MutableLiveData<Int>()
    val nowHp = MutableLiveData<Int>()
    val nowAtk = MutableLiveData<Int>()
    val nowDef = MutableLiveData<Int>()
    val nowSpd = MutableLiveData<Int>()

    val growth = MutableLiveData<String>()
    val growthHp = MutableLiveData<String>()
    val growthAtk = MutableLiveData<String>()
    val growthDef = MutableLiveData<String>()
    val growthSpd = MutableLiveData<String>()

    val resultGrowth = MutableLiveData<String>()
    val resultGrowthHp = MutableLiveData<String>()
    val resultGrowthAtk = MutableLiveData<String>()
    val resultGrowthDef = MutableLiveData<String>()
    val resultGrowthSpd = MutableLiveData<String>()

    val petMaxHp = MutableLiveData<String>()
    val petMaxAtk = MutableLiveData<String>()
    val petMaxDef = MutableLiveData<String>()
    val petMaxSpd = MutableLiveData<String>()
    val petMaxGrowth = MutableLiveData<String>()

}