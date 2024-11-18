package com.example.mundomascota

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class Pantalla5 : AppCompatActivity() {

    private lateinit var EditarPerfil1: Button
    private lateinit var EditarPerfil2: Button
    private lateinit var EditarPerfil: Button
    private lateinit var AgregarPerfil: Button
    private lateinit var imageView11: ImageView
    private lateinit var imageView12: ImageView
    private lateinit var imageView13: ImageView
    private lateinit var salirButton: Button
    private lateinit var atrasButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pantalla5)

        // Inicializar botones y vistas
        EditarPerfil1 = findViewById(R.id.EditarPerfil1)
        EditarPerfil2 = findViewById(R.id.EditarPerfil2)
        EditarPerfil = findViewById(R.id.EditarPerfil)
        AgregarPerfil = findViewById(R.id.AgregarPerfil)
        imageView11 = findViewById(R.id.imageView11)
        imageView12 = findViewById(R.id.imageView12)
        imageView13 = findViewById(R.id.imageView13)
        salirButton = findViewById(R.id.Salir)
        atrasButton = findViewById(R.id.Atras)


        EditarPerfil1.setOnClickListener {
            Toast.makeText(this, "Editar Perfil 1", Toast.LENGTH_SHORT).show()
        }

        EditarPerfil2.setOnClickListener {
            Toast.makeText(this, "Editar Perfil 2", Toast.LENGTH_SHORT).show()
        }

        EditarPerfil.setOnClickListener {
            Toast.makeText(this, "Editar Perfil", Toast.LENGTH_SHORT).show()
        }

        AgregarPerfil.setOnClickListener {
            Toast.makeText(this, "Agregar Perfil", Toast.LENGTH_SHORT).show()
        }

        imageView11.setOnClickListener {
            Toast.makeText(this, "Imagen 1", Toast.LENGTH_SHORT).show()
        }

        imageView12.setOnClickListener {
            Toast.makeText(this, "Imagen 2", Toast.LENGTH_SHORT).show()
        }

        imageView13.setOnClickListener {
            Toast.makeText(this, "Imagen 3", Toast.LENGTH_SHORT).show()
        }


        atrasButton.setOnClickListener {
            val intent = Intent(this@Pantalla5, Pantalla4::class.java)
            onBackPressed()
        }



        salirButton.setOnClickListener {
            val intent = Intent(this@Pantalla5, Pantalla6::class.java)
            startActivity(intent)
            finish()
        }
    }
}

