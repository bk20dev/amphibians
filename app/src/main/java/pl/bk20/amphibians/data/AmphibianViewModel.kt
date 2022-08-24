package pl.bk20.amphibians.data

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch
import pl.bk20.amphibians.network.Amphibian
import pl.bk20.amphibians.network.AmphibianApi

enum class AmphibianApiStatus {
    LOADING, DONE, ERROR
}

class AmphibianViewModel : ViewModel() {
    private val _amphibianList = MutableLiveData<List<Amphibian>>()
    val amphibianList: LiveData<List<Amphibian>> = _amphibianList

    private val _status = MutableLiveData(AmphibianApiStatus.LOADING)
    val status: LiveData<AmphibianApiStatus> = _status

    init {
        loadAmphibians()
    }

    private fun loadAmphibians() {
        viewModelScope.launch {
            _status.value = AmphibianApiStatus.LOADING
            try {
                _amphibianList.value = AmphibianApi.retrofitService.getAmphibians()
                _status.value = AmphibianApiStatus.DONE
            } catch (exception: Exception) {
                _status.value = AmphibianApiStatus.ERROR
            }
        }
    }
}