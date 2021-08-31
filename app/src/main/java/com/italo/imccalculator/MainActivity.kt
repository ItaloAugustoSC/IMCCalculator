package com.italo.imccalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.w("lifecycle", "Entrei no CREATE")

    }

    override fun onStart() {
        super.onStart()
        Log.w("lifecycle", "Entrei no START")
    }

    override fun onResume() {
        super.onResume()
        Log.w("lifecycle", "Entrei no RESUME")
    }

    override fun onPause() {
        super.onPause()
        Log.w("lifecycle", "Entrei no PAUSE")
    }

    override fun onStop() {
        super.onStop()
        Log.w("lifecycle", "Entrei no STOP")
    }

    override fun onRestart() {
        super.onRestart()
        Log.w("lifecycle", "Entrei no RESTART")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.w("lifecycle", "Entrei no DESTROY")
    }
}