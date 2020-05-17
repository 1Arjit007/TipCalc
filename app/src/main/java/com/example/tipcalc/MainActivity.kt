package com.example.tipcalc

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //window.decorView.setBackgroundColor(Color.TRANSPARENT)
        importantInfo.visibility = View.INVISIBLE
        calculatetextview.setOnClickListener {
            val bill = BilleditText.text.toString().toDouble()
            val tipPercentagae = tipedittext.text.toString().toDouble()/100
            val tip= bill * tipPercentagae
            val total=tip + bill
            importantInfo.visibility = View.VISIBLE

            importantInfo.text = "Tip: ${doubleToDollar(tip)} Total:  ${doubleToDollar(total)}"

        }
    }
    fun doubleToDollar(number:Double):String{
        return "$" + String.format("%.2f",number)
    }
}
