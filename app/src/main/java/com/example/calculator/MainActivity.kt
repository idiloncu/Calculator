package com.example.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.calculator.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=DataBindingUtil.setContentView(this,R.layout.activity_main)
        binding.mainActivityObject=this

        binding.answerResult="0"

    }
    fun buttonAddClicked(enteredNum1:String,enteredNum2:String){
        binding.buttonAdd.setOnClickListener{
            val add=enteredNum1.toInt() + enteredNum2.toInt()
            binding.answerResult = add.toString()
        }
    }
    fun buttonMultipleClicked(enteredNum1:String,enteredNum2:String){
        binding.buttonMultiple.setOnClickListener{
            val mul=enteredNum1.toInt() * enteredNum2.toInt()
            binding.answerResult = mul.toString()
        }
    }
    fun buttonSubClicked(enteredNum1:String,enteredNum2:String){
        binding.buttonSub.setOnClickListener{
            val sub=enteredNum1.toInt() - enteredNum2.toInt()
            binding.answerResult = sub.toString()
        }
    }
    fun buttonDividedClicked(enteredNum1:String,enteredNum2:String){
        binding.buttonDivided.setOnClickListener{
            val div=enteredNum1.toInt() / enteredNum2.toInt()
            binding.answerResult= div.toString()
        }
    }
}