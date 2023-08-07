package com.example.calculator

sealed class CalculatorOperation(val symbol: String){
    object Add: CalculatorOperation("+")
    object Subtract: CalculatorOperation("-")
    object MultiPly: CalculatorOperation("x")
    object Divide: CalculatorOperation("/")
}
