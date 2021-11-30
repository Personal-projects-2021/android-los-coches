package com.example.loscochesaguazul

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_menu.*

class MenuActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)

        btnCreateAppointment.setOnClickListener {
            val intent = Intent(this, UserVehicleSelectActivity::class.java)
            startActivity(intent)
        }

        btnReadAppointments.setOnClickListener {
            val intent = Intent(this, UserAppointmentIndexActivity::class.java)
            startActivity(intent)
        }

        btnCreateVehicle.setOnClickListener {
            val intent = Intent(this, UserMarkSelectActivity::class.java)
            startActivity(intent)
        }

        btnReadVehicles.setOnClickListener {
            val intent = Intent(this, UserVehicleIndexActivity::class.java)
            startActivity(intent)
        }
    }
}