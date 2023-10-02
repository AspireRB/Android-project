package com.example.eduninja.ui.profits

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class ProfitsViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is profits Fragment"
    }
    val text: LiveData<String> = _text
}