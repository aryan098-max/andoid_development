package com.example.practice
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*


class MainActivity : AppCompatActivity() {

    var radioGroup: RadioGroup? = null
    lateinit var radioButton: RadioButton
    private lateinit var button: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        radioGroup = findViewById(R.id.radio_group)

        button = findViewById(R.id.button)


        button.setOnClickListener {

            val selectedOption: Int = radioGroup!!.checkedRadioButtonId

            radioButton = findViewById(selectedOption)

            Toast.makeText(baseContext, radioButton.text, Toast.LENGTH_SHORT).show()
        }
        val showButton = findViewById<Button>(R.id.button2)


        val editText = findViewById<EditText>(R.id.edtext)


        showButton.setOnClickListener {

            val text = editText.text
            val check: CheckBox = findViewById(R.id.checkbox)
            if (check.isChecked) {
                Toast.makeText(this, text, Toast.LENGTH_SHORT).show()
            }
        }

    }


}