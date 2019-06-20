package com.answer.question.Kotlin

import android.content.Intent
import android.os.Handler
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import android.widget.ImageView
import android.widget.TextView
import com.answer.question.R


class SplashActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
        var lodingicon : ImageView = findViewById(R.id.splashicon)
        var lodingtitle: TextView = findViewById(R.id.splashtitle)
        var animation: Animation = AnimationUtils.loadAnimation(applicationContext, R.anim.splash_animation)
        var animation2: Animation = AnimationUtils.loadAnimation(applicationContext, R.anim.splash_animation_2)
        lodingicon.startAnimation(animation)
        lodingtitle.startAnimation(animation2)
        Handler().postDelayed({
            var intent :Intent = Intent(applicationContext, LogIn::class.java)
            startActivity(intent)
        }, 2500)
    }
}

