package com.aleem.circularprogressbar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ProgressBar
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private var progr = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val progressButton = findViewById<Button>(R.id.startProgress)

        progressButton.setOnClickListener {
            if(progr != 100){
                progr += 10
                updateProgressBar()
            }else{
                progr = 0
                updateProgressBar()
            }
        }
    }

    private fun updateProgressBar(){
        val progressBar = findViewById<ProgressBar>(R.id.progressBar)
        val progressText = findViewById<TextView>(R.id.showPercentage)
        progressBar.progress = progr
        progressText.text = getString(R.string.showPercentage,progr)
    }
}