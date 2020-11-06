package com.example.pruebakt

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import java.util.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val boton : Button = findViewById<Button>(R.id.boton)
        boton.setOnClickListener(){
            generarAleatorio()
        }
    }

    fun generarAleatorio(){
         var imagen : ImageView = findViewById(R.id.imagen_dado)
         val numeroRandom = Random().nextInt(6) + 1
         val recursoImagen = when(numeroRandom){
             1 -> R.drawable.dice_1
             2 -> R.drawable.dice_2
             3 -> R.drawable.dice_3
             4 -> R.drawable.dice_4
             5 -> R.drawable.dice_5
             else -> R.drawable.dice_6
         }
        imagen.setImageResource(recursoImagen)
    }
}