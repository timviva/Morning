package com.example.secondfirefoxmorningapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
//    Instantiate the UI elements
    var btn_reg : Button ?= null
    var btn_login :Button ?=null
    var myPhoto : ImageView ?=null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//        Reference the elements using their respective ID
        btn_reg=findViewById((R.id.MbtnReg))
        btn_login=findViewById(R.id.MbtnLogin)
        myPhoto=findViewById(R.id.mImgPhoto)
//        Set listeners to the elements

        btn_reg!!.setOnClickListener{
            Toast.makeText(applicationContext, "Register Button Clicked", Toast.LENGTH_SHORT).show()
        }
        btn_login!!.setOnClickListener{
            Toast.makeText(applicationContext, "Login Button Clicked", Toast.LENGTH_SHORT).show()
        }
        myPhoto!!.setOnClickListener{
            Toast.makeText(applicationContext, "Image Photo Clicked", Toast.LENGTH_SHORT).show()
        }

    }
}