package com.anditorx.muvvi.sign

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.anditorx.muvvi.R
import kotlinx.android.synthetic.main.activity_sign_in.*
import com.google.firebase.database.*
import com.google.firebase.database.FirebaseDatabase

class SignInActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_in)

        btn_sign_in.setOnClickListener{
        // Write a message to the database
            // Write a message to the database
            val database: FirebaseDatabase = FirebaseDatabase.getInstance()
            val myRef: DatabaseReference = database.getReference("message")

            myRef.setValue("Hello, World!")
        }
    }
}