package com.example.calculator

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import com.example.calculator.databinding.ActivityMainBinding
import com.example.calculator.viewmodel.CalculateViewModel

class MainActivity : AppCompatActivity() {

    private val viewModel: CalculateViewModel by viewModels()
    private lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        val view=binding.root
        setContentView(view)

        viewModel.result.observe(this, Observer {
                result -> binding.textView.text = result.toString()
        })

        binding.buttonAdd.setOnClickListener {
            val a=binding.editText1.text.toString().toDoubleOrNull()
            val b = binding.editText2.text.toString().toDoubleOrNull()
            if (a != null && b != null) {
                viewModel.add(a,b)
            }
        }
        binding.buttonSub.setOnClickListener {
            val a =binding.editText1.text.toString().toDoubleOrNull()
            val b =binding.editText2.text.toString().toDoubleOrNull()
            if (a != null && b != null) {
                viewModel.subtract(a, b)
            }
            binding.buttonMultiple.setOnClickListener {
                val a = binding.editText1.text.toString().toDoubleOrNull()
                val b = binding.editText2.text.toString().toDoubleOrNull()
                if (a != null && b != null) {
                    viewModel.multiply(a, b)
                }
                binding.buttonDivided.setOnClickListener {
                    val a = binding.editText1.text.toString().toDoubleOrNull()
                    val b = binding.editText2.text.toString().toDoubleOrNull()
                    if (a != null && b != null) {
                        viewModel.divide(a, b)
                    }
                }
            }
        }
    }
}