package com.tomuchcoffee.mynavigationdrawer.ui.slideshow

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class SlideshowViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is Slide show Fragment"
    }

    val text: LiveData<String> = _text

}