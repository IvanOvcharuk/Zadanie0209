package com.example.zadanie0209

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.core.view.isVisible

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var obrazek = findViewById<ImageView>(R.id.obraz);
        var textView = findViewById<TextView>(R.id.textView);
        var button = findViewById<Button>(R.id.button);
        findViewById<Button>(R.id.button).setOnClickListener {
            if (obrazek.isVisible == true) {
                button.text = "POKAZ"
                textView.text = "Kot";
                obrazek.isVisible = false;
            }
            else {
                button.text = "UKRYJ"
                textView.text = "Kot";
                obrazek.isVisible = true;
            }
        }
        }
    }