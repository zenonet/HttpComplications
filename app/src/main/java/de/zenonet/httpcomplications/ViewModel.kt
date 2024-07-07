package de.zenonet.httpcomplications

import androidx.compose.runtime.mutableIntStateOf
import androidx.lifecycle.ViewModel

class ViewModel : ViewModel() {
    var selectedComplication = mutableIntStateOf(-1)
    val complications : Array<ComplicationModel> = arrayOf(ComplicationModel(), ComplicationModel(), ComplicationModel(), ComplicationModel())

    fun complicationSelected(index:Int){
        selectedComplication.intValue = index
    }
}