package com.example.calculator

data class CalculatorState(
    val number1: String = "",
    val number2: String = "",
    val operation: CalculatorOperation? = null,
    var error: Boolean = false
) {
    companion object {
        const val ERROR_STATE = "ERROR"
    }
}
