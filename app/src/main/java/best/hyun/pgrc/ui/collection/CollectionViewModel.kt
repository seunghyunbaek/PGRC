package best.hyun.pgrc.ui.collection

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class CollectionViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "Pet"
    }
    val text: LiveData<String> = _text
}