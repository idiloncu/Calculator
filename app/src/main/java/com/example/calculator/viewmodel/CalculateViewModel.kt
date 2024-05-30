package com.example.calculator.viewmodel

import com.example.calculator.model.Calculate
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class CalculateViewModel: ViewModel() {
    private val calculator= Calculate.Calculator()

    private val _result = MutableLiveData<String>()
    val result: LiveData<String> get() = _result
    fun add(a: Double, b: Double) {
        val calcResult = calculator.buttonAddClicked(a, b)
        _result.value = calcResult.result
    }
    fun subtract(a: Double, b: Double) {
        val calcResult = calculator.buttonSubClicked(a, b)
        _result.value = calcResult.result
    }
    fun multiply(a: Double, b: Double) {
        val calcResult = calculator.buttonMultipleClicked(a, b)
        _result.value = calcResult.result
    }
    fun divide(a: Double, b: Double) {
        val calcResult = calculator.buttonDividedClicked(a, b)
        _result.value = calcResult.result
    }
}