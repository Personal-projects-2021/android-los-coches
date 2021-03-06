package com.example.loscochesaguazul

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_user_service_select.*

class UserServiceSelectActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_user_service_select)

        btn_back.setOnClickListener {
            val intent = Intent(this, UserVehicleSelectActivity::class.java)
            startActivity(intent)
        }

        btn_home.setOnClickListener {
            val intent = Intent(this, MenuActivity::class.java)
            startActivity(intent)
        }

        btn_next.setOnClickListener {
            val intent = Intent(this, UserAppointmentCreateActivity::class.java)
            startActivity(intent)
        }
    }
}