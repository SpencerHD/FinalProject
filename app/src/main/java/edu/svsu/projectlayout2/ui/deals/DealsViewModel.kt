package edu.svsu.projectlayout2.ui.deals

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class DealsViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "Current Deals and Coupons"
    }
    val text: LiveData<String> = _text
}