package com.rajapps.foodrunner

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class RegistrationScreen : AppCompatActivity() {
    private lateinit var btnRegister:Button
    lateinit var etName:EditText
    lateinit var etEmailId:EditText
    lateinit var etMobileNumber:EditText
    lateinit var etAddress:EditText
    lateinit var etPassword:EditText
    lateinit var etConfPassword:EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_registration_screen)
        btnRegister=findViewById(R.id.btnRegister)
        etName=findViewById(R.id.etName)
        etEmailId=findViewById(R.id.etEmailId)
        etMobileNumber=findViewById(R.id.etMobileNumber)
        etAddress=findViewById(R.id.etAddress)
        etPassword=findViewById(R.id.etPassword)
        etConfPassword=findViewById(R.id.etConfPassword)
        btnRegister.setOnClickListener{

            if(etMobileNumber.text.length==10 && etName.text.length>=2 && etEmailId.text.isNotBlank()&& etAddress.text.isNotBlank()&&etPassword.text.toString().equals(etConfPassword.text.toString())){
                intent= Intent(this@RegistrationScreen,AfterRegistrationAndForgotPasswordScreen::class.java)
                intent.putExtra("txtName","${etName.text.toString()}")
                intent.putExtra("txtEmail","${etEmailId.text.toString()}")
                intent.putExtra("txtMobileNumber","${etMobileNumber.text.toString()}")
                intent.putExtra("txtDeliveryAddress","${etAddress.text.toString()}")
                intent.putExtra("txtPassword","${etPassword.text.toString()}")
                intent.putExtra("txtConfPassword","${etConfPassword.text.toString()}")
                startActivity(intent)
            }else{
                Toast.makeText(this,"Invalid credentials", Toast.LENGTH_SHORT).show()
            }
        }
    }
}