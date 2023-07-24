package com.rajapps.foodrunner

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class ForgotPasswordPage : AppCompatActivity() {
    lateinit var etMobileNumber:EditText
    lateinit var etEmail:EditText
    lateinit var btnNext:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_forgot_password_page)

        etMobileNumber=findViewById(R.id.etMobileNumber)
        etEmail=findViewById(R.id.etEmailId)
        btnNext=findViewById(R.id.btnNext)
        btnNext.setOnClickListener{
            if(etMobileNumber.text.length==10){
                intent= Intent(this@ForgotPasswordPage,AfterRegistrationAndForgotPasswordScreen::class.java)
                intent.putExtra("txtEmail","${etEmail.text.toString()}")
                intent.putExtra("txtMobileNumber","${etMobileNumber.text.toString()}")
                startActivity(intent)
            }else{
                Toast.makeText(this,"Please enter valid credentials", Toast.LENGTH_SHORT).show()
            }

        }

    }
}