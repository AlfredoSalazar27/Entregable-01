package com.example.mundomascota

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class Pantalla3 : AppCompatActivity() {

    private lateinit var imageView2: ImageView
    private lateinit var imageView3: ImageView
    private lateinit var imageView4: ImageView
    private lateinit var imageView5: ImageView
    private lateinit var imageView6: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pantalla3)


        val editarMascota: Button = findViewById(R.id.EditarMascota)
        val agregarMascota: Button = findViewById(R.id.AgregarMascota)
        val atrasButton: Button = findViewById(R.id.Atras)



        imageView2 = findViewById(R.id.imageView2)
        imageView3 = findViewById(R.id.imageView3)
        imageView4 = findViewById(R.id.imageView4)
        imageView5 = findViewById(R.id.imageView5)
        imageView6 = findViewById(R.id.imageView6)


        editarMascota.setOnClickListener {
            val intent = Intent(this@Pantalla3, EditarMascotaActivity::class.java)
            startActivity(intent)
        }


        agregarMascota.setOnClickListener {
            val intent = Intent(this@Pantalla3, AgregarMascotaActivity::class.java) // Cambia por la actividad correspondiente
            startActivity(intent)
        }


        atrasButton.setOnClickListener {
            val intent = Intent(this@Pantalla3, Pantalla2::class.java)
            onBackPressed()
        }


    }
}
