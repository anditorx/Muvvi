package com.anditorx.muvvi.onboarding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.anditorx.muvvi.R
import android.content.Intent
import com.anditorx.muvvi.sign.SignInActivity
import kotlinx.android.synthetic.main.activity_on_boarding_one.*

class OnBoardingOneActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_on_boarding_one)

        btn_next.setOnClickListener {
            val intent = Intent(this@OnBoardingOneActivity,
                OnBoardingTwoActivity::class.java)
            startActivity(intent)
        }

        btn_skip.setOnClickListener {
            val intent = Intent(this@OnBoardingOneActivity,
                SignInActivity::class.java)
            startActivity(intent)
        }

    }
}