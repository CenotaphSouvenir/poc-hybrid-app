package com.example.hybriddemo.ui.flutter

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class FlutterViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is the Flutter Fragment"
    }
    val text: LiveData<String> = _text
}