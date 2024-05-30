package com.example.calculator.model

data class Calculate (val result:String) {
    class Calculator {
        fun buttonAddClicked(enteredNum1: Double, enteredNum2: Double): Calculate {
            return Calculate((enteredNum1 + enteredNum2).toString())
        }

        fun buttonMultipleClicked(enteredNum1: Double, enteredNum2: Double): Calculate {
            return Calculate((enteredNum1 * enteredNum2).toString())
        }

        fun buttonSubClicked(enteredNum1: Double, enteredNum2: Double): Calculate {
            return Calculate((enteredNum1 - enteredNum2).toString())
        }

        fun buttonDividedClicked(enteredNum1: Double, enteredNum2: Double): Calculate {
            return Calculate((enteredNum1 / enteredNum2).toString())
        }
    }
}