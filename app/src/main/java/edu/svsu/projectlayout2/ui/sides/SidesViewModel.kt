package edu.svsu.projectlayout2.ui.sides

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class SidesViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "Sides and Add-Ons"
    }
    val text: LiveData<String> = _text
}