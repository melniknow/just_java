package com.example.android.justjava

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView


class MainActivity : AppCompatActivity() {
    public
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun submitOrder(view: View) {
        val textView: TextView = findViewById(R.id.none)
        textView.setText("Good")
    }

    fun upCount(view: View) {
        val textView: TextView = findViewById(R.id.quantity_text_view)
        if (textView.text.toString().toInt() < 9)
            textView.setText((textView.text.toString().toInt() + 1).toString())
        reCount(textView.text.toString().toInt())
    }

    fun downCount(view: View) {
        val textView: TextView = findViewById(R.id.quantity_text_view)
        if (textView.text.toString().toInt() >= 2)
            textView.setText((textView.text.toString().toInt() - 1).toString())
        reCount(textView.text.toString().toInt())
    }

    private fun reCount(toInt: Int) {
        val price: TextView = findViewById(R.id.price)
        price.setText((toInt * 10).toString())
    }
}