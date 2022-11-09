package com.example.hybriddemo.ui.reactnative

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class ReactNativeViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is the React Native Fragment"
    }
    val text: LiveData<String> = _text
}