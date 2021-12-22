package com.tomuchcoffee.mynavigationdrawer.ui.gallery

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class GalleyViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is Gallery Fragment"
    }

    val text: LiveData<String> = _text
}