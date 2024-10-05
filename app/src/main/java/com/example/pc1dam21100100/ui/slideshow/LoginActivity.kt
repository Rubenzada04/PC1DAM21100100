package com.example.pc1dam21100100.ui.slideshow

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.pc1dam21100100.R

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val loginButton = findViewById<Button>(R.id.loginButton)
        loginButton.setOnClickListener {
            val email =
                (findViewById<View>(R.id.email) as EditText).text.toString()
            val password =
                (findViewById<View>(R.id.password) as EditText).text.toString()
            if (email == "invitado@android.com" && password == "invitado123") {
                val intent = Intent(
                    this@LoginActivity,
                    MainActivity::class.java
                )
                startActivity(intent)
                finish()
            } else {
                Toast.makeText(
                    this@LoginActivity,
                    "Credenciales inválidas",
                    Toast.LENGTH_SHORT
                ).show()
            }
        }
    }
}