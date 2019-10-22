package com.example.myapplicationkotlin

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_focus.*
import kotlinx.android.synthetic.main.activity_main.*

/**
 * An example full-screen activity that shows and hides the system UI (i.e.
 * status bar and navigation/system bar) with user interaction.
 */
class MeditationActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_meditation)

        meditation_button.setImageState(Activity.FOCUSED_STATE_SET, true)

        focus_button.setOnClickListener{
            startActivity(Intent(this@MeditationActivity,FocusActivity::class.java))
        }
        s_p_button.setOnClickListener{
            startActivity(Intent(this@MeditationActivity,SPActivity::class.java))
        }
    }
}
