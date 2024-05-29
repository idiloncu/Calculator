package com.example.calculator

import com.example.calculator.viewmodel.CalculateViewModel
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.viewModels
import androidx.lifecycle.Observer
import com.example.calculator.R

class MainActivity : AppCompatActivity() {

    private val viewModel: CalculateViewModel by viewModels()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val textView: TextView = findViewById(R.id.textView)
        val editText1: EditText = findViewById(R.id.editText1)
        val editText2: EditText = findViewById(R.id.editText2)
        val buttonAdd: Button = findViewById(R.id.buttonAdd)
        val buttonSub: Button = findViewById(R.id.buttonSub)
        val buttonMultiple: Button = findViewById(R.id.buttonMultiple)
        val buttonDivided: Button = findViewById(R.id.buttonDivided)

        viewModel.result.observe(this, Observer { result -> textView.text = result })

        buttonAdd.setOnClickListener {
            val a = editText1.text.toString().toDoubleOrNull()
            val b = editText2.text.toString().toDoubleOrNull()
            if (a != null && b != null) {
                viewModel.add(a, b)
            }
        }
        buttonSub.setOnClickListener {
            val a = editText1.text.toString().toDoubleOrNull()
            val b = editText2.text.toString().toDoubleOrNull()
            if (a != null && b != null) {
                viewModel.subtract(a, b)
            }
            buttonMultiple.setOnClickListener {
                val a = editText1.text.toString().toDoubleOrNull()
                val b = editText2.text.toString().toDoubleOrNull()
                if (a != null && b != null) {
                    viewModel.multiply(a, b)
                }
                buttonDivided.setOnClickListener {
                    val a = editText1.text.toString().toDoubleOrNull()
                    val b = editText2.text.toString().toDoubleOrNull()
                    if (a != null && b != null) {
                        viewModel.divide(a, b)
                    }
                }
            }
        }
    }
}