package de.zenonet.httpcomplications

import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update

class ComplicationModel {
    private val _state = MutableStateFlow(HttpRequest(""))
    val state: StateFlow<HttpRequest> = _state.asStateFlow()

    fun onUrlChanged(newUrl:String){
        _state.update {
            it.copy(
                url = newUrl
            )
        }
    }
    fun onHttpMethodChanged(method: HttpMethod){
        _state.update {
            it.copy(
                httpMethod = method
            )
        }
    }
}