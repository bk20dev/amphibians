package pl.bk20.amphibians.data

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class AmphibianViewModel : ViewModel() {
    private val _amphibianList = MutableLiveData<List<String>>()
    val amphibianList: LiveData<List<String>> = _amphibianList
}