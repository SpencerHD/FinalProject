package edu.svsu.projectlayout2.ui.home

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class HomeViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "Authentic Mexican Take-Out"
    }
    val text: LiveData<String> = _text
}