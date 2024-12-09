package com.example.mundomascota

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class Pantalla6 : AppCompatActivity() {


    lateinit var mundoMascota1: TextView
    lateinit var imageView14: ImageView
    lateinit var gracias: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pantalla6)


        mundoMascota1 = findViewById(R.id.MundoMascota1)
        imageView14 = findViewById(R.id.imageView14)
        gracias = findViewById(R.id.Gracias)


        imageView14.setOnClickListener {

            Toast.makeText(this, "Imagen clickeada", Toast.LENGTH_SHORT).show()
        }


        mundoMascota1.text = "Bienvenido a Mundo Mascota"
        gracias.text = "Gracias por su visita, ¡vuelva pronto!"
    }
}