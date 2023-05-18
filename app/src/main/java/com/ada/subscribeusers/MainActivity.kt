package com.ada.subscribeusers

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.ada.subscribeusers.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnLogin.setOnClickListener {
            logInUser()
        }

        binding.textviewReferSignUp.setOnClickListener {
            val intent = Intent(this, SignupActivity::class.java)
            startActivity(intent)
            finish()
        }
    }

    private fun logInUser() {

        val email = "teste@gmail.com"
        val senha = "abc"
        if (binding.etEmailIdLogin.text.toString() == email
            && binding.etPasswordLogin.text.toString() == senha
        ) {
            Toast.makeText(this, "Logged!", Toast.LENGTH_SHORT).show()
        } else {
            Toast.makeText(this, "Authentication failed.", Toast.LENGTH_SHORT).show()
        }

    }
}
