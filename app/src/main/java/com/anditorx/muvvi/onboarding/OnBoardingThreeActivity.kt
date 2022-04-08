package com.anditorx.muvvi.onboarding

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.anditorx.muvvi.R
import com.anditorx.muvvi.sign.SignInActivity
import kotlinx.android.synthetic.main.activity_on_boarding_one.*

class OnBoardingThreeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_on_boarding_three)

        btn_next.setOnClickListener {
            val intent = Intent(this@OnBoardingThreeActivity,
                SignInActivity::class.java)
            startActivity(intent)
        }

    }
}