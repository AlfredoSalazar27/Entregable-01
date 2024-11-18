package com.example.mundomascota


import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity


class Pantalla4 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pantalla4)


        val btnAdoptar = findViewById<Button>(R.id.Adoptar)
        val btnAdoptar2 = findViewById<Button>(R.id.Adoptar2)
        val btnComprar = findViewById<Button>(R.id.Comprar)
        val btnComprar2 = findViewById<Button>(R.id.Comprar2)
        val imageView7 = findViewById<ImageView>(R.id.imageView7)
        val imageView8 = findViewById<ImageView>(R.id.imageView8)
        val atrasButton: Button = findViewById(R.id.Atras)


        btnAdoptar.setOnClickListener {

            Toast.makeText(this, "¡Adoptar seleccionado!", Toast.LENGTH_SHORT).show()

        }

        btnAdoptar2.setOnClickListener {

            Toast.makeText(this, "¡Adoptar 2 seleccionado!", Toast.LENGTH_SHORT).show()

        }

        btnComprar.setOnClickListener {

            Toast.makeText(this, "¡Comprar seleccionado!", Toast.LENGTH_SHORT).show()
        }

        btnComprar2.setOnClickListener {

            Toast.makeText(this, "¡Comprar 2 seleccionado!", Toast.LENGTH_SHORT).show()
        }
        atrasButton.setOnClickListener {
            val intent = Intent(this@Pantalla4, Pantalla3::class.java)
            onBackPressed()
        }

    }
}