package edu.temple.classactivity

import android.graphics.Color
import android.hardware.biometrics.PromptContentItemPlainText
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val textView = findViewById<TextView>(R.id.messageTextView)
        val editText = findViewById<EditText>(R.id.nameEntry)
        findViewById<Button>(R.id.button).setOnClickListener {
            if(editText.text.isEmpty()){
                textView.text = "Please enter your name."
                textView.setTextColor(Color.parseColor("#000000"))
            }
            else {
                textView.text = "Hello, " + editText.text + "! Welcome."
                editText.setText("")
                textView.setTextColor(Color.parseColor("#FF8000"))
            }
        }
    }
}