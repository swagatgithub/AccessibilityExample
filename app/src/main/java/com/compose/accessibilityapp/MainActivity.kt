package com.compose.accessibilityapp

import android.content.Intent
import android.content.res.Configuration
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity()
{
    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        findViewById<Button>(R.id.button).setOnClickListener { startActivity(Intent(baseContext , MainActivity2::class.java)) }
    }

    override fun onConfigurationChanged(newConfig: Configuration)
    {
        super.onConfigurationChanged(newConfig)

        resources.updateConfiguration(newConfig , resources.displayMetrics)
        //baseContext.createConfigurationContext(newConfig)
        println("onConfigurationChanged Called..")
    }

    override fun onBackPressed() {
        super.onBackPressed()
    }

}