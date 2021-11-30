package com.example.loscochesaguazul

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_user_vehicle_select.*

class UserVehicleSelectActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_user_vehicle_select)

        btn_back.setOnClickListener {
            val intent = Intent(this, MenuActivity::class.java)
            startActivity(intent)
        }

        register_vehicle.setOnClickListener {
            val intent = Intent(this, UserMarkSelectActivity::class.java)
            startActivity(intent)
        }

        btn_next.setOnClickListener {
            val intent = Intent(this, UserServiceSelectActivity::class.java)
            startActivity(intent)
        }
    }
}