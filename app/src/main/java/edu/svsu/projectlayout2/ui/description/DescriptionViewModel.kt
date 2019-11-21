package edu.svsu.projectlayout2.ui.description

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class DescriptionViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "Restaurant Description"
    }
    val text: LiveData<String> = _text
}