package com.example.shoppingpreferences

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.CheckBox
import android.widget.RadioButton
import android.widget.ToggleButton
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        // Keeps the content out from under the status bar and navigation bar.
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

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
