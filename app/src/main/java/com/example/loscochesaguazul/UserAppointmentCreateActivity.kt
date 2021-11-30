package com.example.loscochesaguazul

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_user_appointment_create.*

class UserAppointmentCreateActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_user_appointment_create)

        btn_back.setOnClickListener {
            val intent = Intent(this, UserServiceSelectActivity::class.java)
            startActivity(intent)
        }

//        btn_home.setOnClickListener {
//            val intent = Intent(this, MenuActivity::class.java)
//            startActivity(intent)
//        }

        btn_create_appointment.setOnClickListener {
            val intent = Intent(this, UserAppointmentIndexActivity::class.java)
            startActivity(intent)
        }
    }
}