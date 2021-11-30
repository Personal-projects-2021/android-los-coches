package com.example.loscochesaguazul

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_user_vehicle_create.*

class UserVehicleCreateActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_user_vehicle_create)

        btn_back.setOnClickListener {
            val intent = Intent(this, UserMarkSelectActivity::class.java)
            startActivity(intent)
        }

        btn_register_vehicle.setOnClickListener {
            val intent = Intent(this, UserVehicleIndexActivity::class.java)
            startActivity(intent)
        }
    }
}