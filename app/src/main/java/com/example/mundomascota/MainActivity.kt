package com.example.mundomascota

import android.content.Intent
import android.graphics.Bitmap
import android.os.Bundle
import android.provider.MediaStore
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var usuarioEditText: EditText
    private lateinit var contraseñaEditText: EditText
    private lateinit var botonAceptar: Button
    private lateinit var botonCancelar: Button
    private lateinit var adjuntarFoto: Button
    private lateinit var textoBienvenida: TextView
    private lateinit var registrarCuenta: TextView
    private lateinit var noTienesCuenta: TextView
    private val REQUEST_CODE_GALLERY = 100
    private val REQUEST_CODE_CAMERA = 101

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Inicializar vistas
        usuarioEditText = findViewById(R.id.PonerUsuario)
        contraseñaEditText = findViewById(R.id.PonerContraseña)
        botonAceptar = findViewById(R.id.BotonAceptar)
        textoBienvenida = findViewById(R.id.MundoMascota)
        registrarCuenta = findViewById(R.id.RegistrarCuenta)
        noTienesCuenta = findViewById(R.id.NoTienesCuenta)
        botonCancelar = findViewById(R.id.BotonCancelar)
        adjuntarFoto = findViewById(R.id.BotonAjuntarFoto)


        botonAceptar.setOnClickListener {
            val usuario = usuarioEditText.text.toString()
            val contraseña = contraseñaEditText.text.toString()

            if (usuario.isEmpty() || contraseña.isEmpty()) {
                Toast.makeText(this, "Por favor ingresa usuario y contraseña", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this, "Bienvenido, $usuario", Toast.LENGTH_SHORT).show()
                val intent = Intent(this, Pantalla2::class.java)
                startActivity(intent)
            }
        }


        botonCancelar.setOnClickListener {
            Toast.makeText(this, "Sesión cancelada", Toast.LENGTH_SHORT).show()
            usuarioEditText.text.clear()
            contraseñaEditText.text.clear()
        }


        adjuntarFoto.setOnClickListener {
            val intent = Intent(Intent.ACTION_PICK, MediaStore.Images.Media.EXTERNAL_CONTENT_URI)
            startActivityForResult(intent, REQUEST_CODE_GALLERY)
        }


        adjuntarFoto.setOnClickListener {
            val takePictureIntent = Intent(MediaStore.ACTION_IMAGE_CAPTURE)
            if (takePictureIntent.resolveActivity(packageManager) != null) {
                startActivityForResult(takePictureIntent, REQUEST_CODE_CAMERA)
            }
        }


        registrarCuenta.setOnClickListener {
            Toast.makeText(this, "Recuperar Contraseña", Toast.LENGTH_SHORT).show()
        }


        noTienesCuenta.setOnClickListener {
            Toast.makeText(this, "Redirigir a pantalla de registro", Toast.LENGTH_SHORT).show()
        }
    }


    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)

        if (resultCode == RESULT_OK) {
            val imageView: ImageView = findViewById(R.id.imageView)

            if (requestCode == REQUEST_CODE_GALLERY) {
                val imageUri = data?.data
                imageView.setImageURI(imageUri)
            } else if (requestCode == REQUEST_CODE_CAMERA) {
                val photo: Bitmap = data?.extras?.get("data") as Bitmap
                imageView.setImageBitmap(photo)
            }
        }
    }
}

