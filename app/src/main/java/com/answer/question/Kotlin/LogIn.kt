package com.answer.question.Kotlin

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.inputmethod.InputMethodManager
import android.widget.EditText
import android.widget.TextView
import com.answer.question.R

class LogIn : AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_log_in)

        var gotosignup:TextView = findViewById(R.id.gotosignup)
        var logId:EditText = findViewById(R.id.logId)
        logId.requestFocus()

        var showkeyboard:InputMethodManager = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
        showkeyboard.showSoftInput(logId, 0)

        gotosignup.setOnClickListener{
            var intent  = Intent(applicationContext, SignUp::class.java)
          startActivity(intent)
        }
    }
}

