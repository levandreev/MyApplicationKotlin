package com.example.myapplicationkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Window
import android.widget.Toast.LENGTH_LONG
import android.widget.Toast.makeText
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


//        my_button1.setOnClickListener{
//            makeText(this, "You clicked the button", LENGTH_LONG).show()
//        }
    }


}
