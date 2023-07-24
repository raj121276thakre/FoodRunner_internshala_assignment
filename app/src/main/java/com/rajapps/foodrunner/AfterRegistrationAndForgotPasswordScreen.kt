package com.rajapps.foodrunner

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class AfterRegistrationAndForgotPasswordScreen : AppCompatActivity() {

    lateinit var txtMobileNumber:TextView
    lateinit var txtDelivery:TextView
    lateinit var txtPassword:TextView
    lateinit var txtConfPassword:TextView
    lateinit var txtName:TextView
    lateinit var txtEmail:TextView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_after_registration_and_forgot_password_screen)

        txtMobileNumber=findViewById(R.id.txtMobileNumber)
        txtPassword=findViewById(R.id.txtPassword)
        txtConfPassword=findViewById(R.id.txtConfPassword)
        txtDelivery=findViewById(R.id.txtDeliveryAddress)
        txtName=findViewById(R.id.txtName)
        txtEmail=findViewById(R.id.txtEmail)


        if(intent!=null){
            txtMobileNumber.text=intent.getStringExtra("txtMobileNumber")
            txtDelivery.text=intent.getStringExtra("txtDeliveryAddress")
            txtPassword.text=intent.getStringExtra("txtPassword")
            txtConfPassword.text=intent.getStringExtra("txtConfPassword")
            txtName.text=intent.getStringExtra("txtName")
            txtEmail.text=intent.getStringExtra("txtEmail")

        }
    }
}