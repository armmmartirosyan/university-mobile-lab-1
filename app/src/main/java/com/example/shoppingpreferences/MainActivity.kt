package com.example.shoppingpreferences

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.CheckBox
import android.widget.RadioButton
import android.widget.ToggleButton
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val discountCheck = findViewById<CheckBox>(R.id.discountCheck)
        val newProductCheck = findViewById<CheckBox>(R.id.newProductCheck)
        val deliveryToggle = findViewById<ToggleButton>(R.id.deliveryToggle)
        val cardRadio = findViewById<RadioButton>(R.id.cardRadio)
        val saveButton = findViewById<Button>(R.id.saveButton)

        discountCheck.isChecked = true
        newProductCheck.isChecked = true

        // checked = true -> textOn -> «ԱՌԱՔՈՒՄ»
        deliveryToggle.isChecked = true

        // Card is selected; the RadioGroup keeps the other two unselected.
        cardRadio.isChecked = true

        saveButton.visibility = View.VISIBLE
        saveButton.isEnabled = true
    }
}
