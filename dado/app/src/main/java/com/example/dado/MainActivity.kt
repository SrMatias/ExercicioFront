package com.example.dado

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d("Ciclo","onCreate")



        val buttonD6 = findViewById<Button>(R.id.buttonD6)
        val button12 = findViewById<Button>(R.id.buttonD12)
        val button20 = findViewById<Button>(R.id.buttonD20)
        val buttonNext= findViewById<Button>(R.id.buttonNext)
        val intentSesunda= Intent(this,SegundaActivity::class.java)

        buttonNext.setOnClickListener {
            startActivity(intentSesunda)
        }

        buttonD6.setOnClickListener {
           // Toast.makeText( this,"DADO DE 6 LADOS INICIADO", Toast.LENGTH_SHORT).show()
            rolarDados(6)
        }

        button12.setOnClickListener{
            //Toast.makeText( this,"DADO DE 12 LADOS INICIADO", Toast.LENGTH_SHORT).show()
            rolarDados(12)
        }

        button20.setOnClickListener{
           // Toast.makeText( this,"DADO DE 20 LADOS INICIADO", Toast.LENGTH_SHORT).show()
            rolarDados(20)
        }

    }

    private fun rolarDados(lados:Int) {
        val rolagem =(1..lados).random()

        val textDado = findViewById<TextView>(R.id.textDADO)
        textDado.text=rolagem.toString()
    }

    override fun onStart() {
        super.onStart()
        Log.d("Ciclo","onStart")
    }
    override fun onResume() {
        super.onResume()
        Log.d("Ciclo","onResume")
    }
    override fun onPause() {
        super.onPause()
        Log.d("Ciclo","onPause")
    }
    override fun onStop() {
        super.onStop()
        Log.d("Ciclo","onStop")
    }
    override fun onDestroy() {
        super.onDestroy()
        Log.d("Ciclo","onDestroy")
    }
}