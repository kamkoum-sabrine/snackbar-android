package com.example.snackbar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.constraintlayout.widget.ConstraintLayout
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {
    lateinit var button : Button
    lateinit var layout : ConstraintLayout
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button = findViewById(R.id.btn)
        layout = findViewById(R.id.layout)
        button.setOnClickListener{
            Snackbar.make(
                layout,
                "This is a Snackbar message",
                Snackbar.LENGTH_INDEFINITE)
                .setAction(
                    "Close", View.OnClickListener {  }
                ).show()

        }
    }
}