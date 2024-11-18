package com.example.mundomascota

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class Pantalla2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pantalla2)


        val perfilMascotas = findViewById<Button>(R.id.PerfilMascotas)
        val adoptarYComprar = findViewById<Button>(R.id.AdoptarYComprar)
        val perfilUsuario = findViewById<Button>(R.id.PerfilUsuario)


        val atrasButton = findViewById<Button>(R.id.Atras)



        perfilMascotas.setOnClickListener { v: View? ->
            val intent = Intent(this@Pantalla2, Pantalla3::class.java)
            startActivity(intent)
        }


        adoptarYComprar.setOnClickListener { v: View? ->
            val intent = Intent(this@Pantalla2, Pantalla4::class.java)
            startActivity(intent)
        }


        perfilUsuario.setOnClickListener { v: View? ->
            val intent = Intent(this@Pantalla2, Pantalla5::class.java)
            startActivity(intent)
        }


        atrasButton.setOnClickListener {
            val intent = Intent(this@Pantalla2, MainActivity::class.java)
            onBackPressed()
        }



    }
}

