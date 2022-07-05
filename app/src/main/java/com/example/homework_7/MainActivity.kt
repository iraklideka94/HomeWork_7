package com.example.homework_7

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.InputType
import android.view.ViewGroup
import android.widget.EditText
import android.widget.LinearLayout
import android.widget.Toast
import androidx.appcompat.widget.AppCompatEditText
import com.example.homework_7.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.addBtn.setOnClickListener {

            if (binding.edText.text.toString().isEmpty()) {
                Toast.makeText(this, "Please,Fill The Field", Toast.LENGTH_SHORT)
                    .show()
            } else {

                val newEditText = AppCompatEditText(this)
                val view = binding.layout
                val layoutParams = LinearLayout.LayoutParams(
                    ViewGroup.LayoutParams.MATCH_PARENT,
                    ViewGroup.LayoutParams.WRAP_CONTENT
                )
                if (binding.checkBox.isChecked) {
                    newEditText.inputType = InputType.TYPE_CLASS_NUMBER
                    newEditText.hint = "Numeric Field"
                    view.addView(newEditText, layoutParams)
                } else {
                    newEditText.inputType = InputType.TYPE_CLASS_TEXT
                    newEditText.hint = "Text Field"
                    view.addView(newEditText, layoutParams)
                }
            }
        }
    }
}