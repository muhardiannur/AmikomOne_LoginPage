package com.example.amikomserviceapp

import android.os.Bundle
import android.provider.ContactsContract.CommonDataKinds.Email
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import java.net.PasswordAuthentication

class MainActivity : AppCompatActivity() {

    private lateinit var etEmail : EditText
    private lateinit var etPassword : EditText
    private lateinit var btnValidate : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        supportActionBar?.hide()

        etEmail = findViewById(R.id.etEmail)
        etPassword = findViewById(R.id.etPassword)
        btnValidate = findViewById(R.id.btnValidate)

        btnValidate.setOnClickListener {

            val email = etEmail.text.toString().trim()
            val  password = etPassword.text.toString().trim()

            if (email.isEmpty()){
                etEmail.error = "Email Required"
                return@setOnClickListener
            }else if (password.isEmpty()){
                etPassword.error = "Password Required"
                return@setOnClickListener
            }else{
                Toast.makeText(this, "Login Success", Toast.LENGTH_SHORT).show()
            }
        }

    }
}