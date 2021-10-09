package com.italo.imccalculator


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.widget.doAfterTextChanged
import android.util.Log
import android.widget.Toast
import androidx.core.widget.doOnTextChanged
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //Log.w("lifecycle", "Entrei no CREATE")
        setListeners()
    }

    private fun setListeners(){

        alturaEDT?.doAfterTextChanged { text ->
            Toast.makeText(this, text, Toast.LENGTH_SHORT).show()
        }

        pesoEDT?.doOnTextChanged { text, _, _, _ ->
            titleTXT?.text = text
        }

        resultadoBTN?.setOnClickListener{
            IMCCalculus(pesoEDT.text.toString(), alturaEDT.text.toString())
        }
    }

    private fun IMCCalculus(peso: String, altura: String) {
        val peso = peso.toFloatOrNull()
        val altura = altura.toFloatOrNull()
        if(peso != null && altura != null){
            val imc = peso / (altura * altura)
            titleTXT.text = "Seu IMC é:\n%.2f".format(imc)
        }
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