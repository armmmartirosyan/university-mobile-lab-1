package com.example.shoppingpreferences

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.CheckBox
import android.widget.EditText
import android.widget.RadioButton
import android.widget.TextView
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

        val nameInput = findViewById<EditText>(R.id.nameInput)
        val emailInput = findViewById<EditText>(R.id.emailInput)
        val resultText = findViewById<TextView>(R.id.resultText)
        val helpButton = findViewById<Button>(R.id.helpButton)

        saveButton.setOnClickListener {
            // Read the fields here, at click time, to get what is typed right now.
            val name = nameInput.text.toString()
            val email = emailInput.text.toString()

            resultText.text = "${getString(R.string.buyer_label)} $name, " +
                "${getString(R.string.email_label)} $email"
        }

        helpButton.setOnClickListener {
            val intent = Intent(this, HelpActivity::class.java)
            startActivity(intent)
        }
    }
}
