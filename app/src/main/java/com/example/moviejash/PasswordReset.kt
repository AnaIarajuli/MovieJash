package com.example.moviejash

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.ActionBar
import com.google.firebase.auth.ktx.auth
import com.google.firebase.ktx.Firebase

class PasswordReset : AppCompatActivity() {

    private lateinit var ResetEmail2: EditText
    private lateinit var ResetPasswordButton2: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_password_reset)

        val actionBar: ActionBar? = supportActionBar
        actionBar?.hide()

        ResetEmail2 = findViewById(R.id.ResetEmail2)
        ResetPasswordButton2 = findViewById(R.id.ResetPasswordButton2)

        ResetPasswordButton2.setOnClickListener {
            val resetEmail = ResetEmail2.text.toString()

            Firebase.auth.sendPasswordResetEmail(resetEmail).addOnCompleteListener { task ->

                if (task.isSuccessful) {
                    Toast.makeText(this, "Check Your Email", Toast.LENGTH_SHORT).show()
                }
                else {
                    Toast.makeText(this, "Enter valid Email", Toast.LENGTH_SHORT).show()
                }
            }
        }
    }
}