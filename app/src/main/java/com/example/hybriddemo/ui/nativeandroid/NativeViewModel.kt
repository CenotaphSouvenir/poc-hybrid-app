package com.example.hybriddemo.ui.nativeandroid

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class NativeViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is the native Android Fragment"
    }
    val text: LiveData<String> = _text
}