package com.ada.subscribeusers

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.ada.subscribeusers.databinding.ActivitySignupBinding

class SignupActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySignupBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySignupBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnSignup.setOnClickListener {
            signUpUser()
        }

    }
    private fun signUpUser() {
        val name = binding.etNameSignup.text.toString().trim()
        val email = binding.etEmailIdSignup.text.toString().trim()
        val password = binding.etPasswordSignup.text.toString().trim()

        if (name.isNotEmpty() && email.isNotEmpty() && password.isNotEmpty()) {
            Toast.makeText(this, "Welcome", Toast.LENGTH_SHORT).show()
        } else {
            Toast.makeText(this, "Please complete the fields", Toast.LENGTH_SHORT).show()
        }
    }
}

