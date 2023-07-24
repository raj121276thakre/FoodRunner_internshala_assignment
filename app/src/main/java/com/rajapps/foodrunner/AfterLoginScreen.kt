package com.rajapps.foodrunner

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class AfterLoginScreen : AppCompatActivity() {

 lateinit var txtMobileNumber:TextView
 lateinit var txtPassword:TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_after_login_screen)

        txtMobileNumber=findViewById(R.id.txtMobileNumber)
        txtPassword=findViewById(R.id.txtPassword)

        if (intent!=null ){
            val password:String=intent.getStringExtra("password").toString()
            val mobileNumber:String=intent.getStringExtra("mobileNumber").toString()

            if(password!=""&&mobileNumber!=""){
                txtPassword.text=password
                txtMobileNumber.text=mobileNumber
            }

        }
    }
}