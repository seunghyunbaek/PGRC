package best.hyun.pgrc.ui.collection

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import best.hyun.pgrc.type.ELEMENTAL

class CollectionViewModel : ViewModel() {

    val name = MutableLiveData<String>()

    val mainElemental = MutableLiveData<ELEMENTAL>()
    val subElemental = MutableLiveData<ELEMENTAL?>()

    val mainElementalValue = MutableLiveData<Int>()
    val subElementalValue = MutableLiveData<Int>()

    val initLv = MutableLiveData<String>()
    val maxLv = MutableLiveData<String>()
    val growth = MutableLiveData<String>()

    val initHp = MutableLiveData<String>()
    val initAtk = MutableLiveData<String>()
    val initDef = MutableLiveData<String>()
    val initSpd = MutableLiveData<String>()

    val maxHp = MutableLiveData<String>()
    val maxAtk = MutableLiveData<String>()
    val maxDef = MutableLiveData<String>()
    val maxSpd = MutableLiveData<String>()

    val growthHp = MutableLiveData<String>()
    val growthAtk = MutableLiveData<String>()
    val growthDef = MutableLiveData<String>()
    val growthSpd = MutableLiveData<String>()
    val growthAll = MutableLiveData<String>()
}