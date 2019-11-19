package com.example.myapplicationkotlin

import android.app.Activity
import android.content.Intent
import android.graphics.Color
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_focus.*
import kotlinx.android.synthetic.main.activity_focus.focus_button
import kotlinx.android.synthetic.main.activity_focus.meditation_button
import kotlinx.android.synthetic.main.activity_focus.s_p_button
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_meditation.*

/**
 * An example full-screen activity that shows and hides the system UI (i.e.
 * status bar and navigation/system bar) with user interaction.
 */
class MeditationActivity : AppCompatActivity() {
    lateinit var mediaPlayer: MediaPlayer
    private var playing:Boolean = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_meditation)
        meditation_button.setBackgroundColor(Color.GREEN)

        meditation_button.setImageState(Activity.FOCUSED_STATE_SET, true)

        focus_button.setOnClickListener{
            startActivity(Intent(this@MeditationActivity,FocusActivity::class.java))
        }
        s_p_button.setOnClickListener{
            startActivity(Intent(this@MeditationActivity,SPActivity::class.java))
        }

        play_button.setOnClickListener{
            if(playing){
                mediaPlayer.stop()
                mediaPlayer.reset()
                mediaPlayer.release()
                playing = false

            }
            else{
                mediaPlayer = MediaPlayer.create(applicationContext,R.raw.m83_midnightcity)
                mediaPlayer.start()
                playing = true
                Toast.makeText(this,"media playing",Toast.LENGTH_SHORT).show()
            }

//            MediaPlayer.create(this@MeditationActivity, R.raw.m83_midnightcity).start()
        }
    }
}
