package com.example.mini_calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btn_plus.setOnClickListener {
            val n1 = Number1.text.toString().toInt()
            val n2 = Number2.text.toString().toInt()
            val sum = n1 + n2
            Result_num.setText("$sum")
            Symbol.setText("+")
        }
        btn_minus.setOnClickListener {
            val n1 = Number1.text.toString().toInt()
            val n2 = Number2.text.toString().toInt()
            val sum = n1 - n2
            Result_num.setText("$sum")
            Symbol.setText("-")
        }
        btn_multiply.setOnClickListener {
            val n1 = Number1.text.toString().toInt()
            val n2 = Number2.text.toString().toInt()
            val sum = n1 * n2
            Result_num.setText("$sum")
            Symbol.setText("*")
        }
        btn_divider.setOnClickListener {
            val n1 = Number1.text.toString().toInt()
            val n2 = Number2.text.toString().toInt()
            val sum = n1 / n2
            Result_num.setText("$sum")
            Symbol.setText("/")
        }
        btn_modulo.setOnClickListener {
            val n1 = Number1.text.toString().toInt()
            val n2 = Number2.text.toString().toInt()
            val sum = n1 % n2
            Result_num.setText("$sum")
            Symbol.setText("%")
        }
        btn_clear.setOnClickListener {
            Number1.setText("")
            Number2.setText("")
            Symbol.setText("")
            Result_num.setText("")
        }
    }
}