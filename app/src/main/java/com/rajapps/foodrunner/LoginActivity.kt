package com.rajapps.foodrunner

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class LoginActivity : AppCompatActivity() {
    lateinit var etMobileNumber: EditText
    lateinit var etPassword: EditText
    lateinit var btnLogin: Button
    lateinit var txtForgotPassword:TextView
    lateinit var txtSignup:TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        btnLogin=findViewById(R.id.btnLogin)
        etMobileNumber=findViewById(R.id.etMobileNumber)
        etPassword=findViewById(R.id.etPassword)
        txtForgotPassword=findViewById(R.id.txtForgotPassword)
        txtSignup=findViewById(R.id.txtSignup)
        btnLogin.setOnClickListener{

            var intent= Intent(this@LoginActivity,AfterLoginScreen::class.java)
            val mobileNumber:String=etMobileNumber.text.toString()
            val password:String=etPassword.text.toString()
            if(mobileNumber.length==10&&password.length>=4){
                intent.putExtra("mobileNumber","Mobile Number:$mobileNumber")
                intent.putExtra("password","Password:$password")
                startActivity(intent)
            }else{
                Toast.makeText(this@LoginActivity,"Please enter valid credentials",Toast.LENGTH_SHORT).show()
            }
        }
        txtForgotPassword.setOnClickListener{
            var intent= Intent(this@LoginActivity,ForgotPasswordPage::class.java)
            startActivity(intent)
        }
        txtSignup.setOnClickListener{
            var intent= Intent(this@LoginActivity,RegistrationScreen::class.java)
            startActivity(intent)
        }
    }
}