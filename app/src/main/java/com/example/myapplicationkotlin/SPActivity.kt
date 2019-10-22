package com.example.myapplicationkotlin

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.View
import android.widget.SeekBar
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_focus.*
import kotlinx.android.synthetic.main.activity_focus.focus_button
import kotlinx.android.synthetic.main.activity_focus.meditation_button
import kotlinx.android.synthetic.main.activity_focus.s_p_button
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_s_p.*

/**
 * An example full-screen activity that shows and hides the system UI (i.e.
 * status bar and navigation/system bar) with user interaction.
 */
class SPActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_s_p)


        s_p_button.setImageState(Activity.FOCUSED_STATE_SET, true)
        focus_button.setOnClickListener{
            startActivity(Intent(this@SPActivity,FocusActivity::class.java))
            print(focus_button.isSelected)
        }

        meditation_button.setOnClickListener{
            startActivity(Intent(this@SPActivity,MeditationActivity::class.java))
        }

        seekBar_duration.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener {

            override fun onProgressChanged(seekBar: SeekBar, i: Int, b: Boolean) {
                // Display the current progress of SeekBar
                number_block_duration.text = "$i"
            }

            override fun onStartTrackingTouch(seekBar: SeekBar) {
                // Do something
                Toast.makeText(applicationContext,"Set block duration in min",Toast.LENGTH_SHORT).show()
            }

            override fun onStopTrackingTouch(seekBar: SeekBar) {
                // Do something
                Toast.makeText(applicationContext,"Duration was successfully set",Toast.LENGTH_SHORT).show()
            }
        })

        seekBar_blocks.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener {

            override fun onProgressChanged(seekBar: SeekBar, i: Int, b: Boolean) {
                // Display the current progress of SeekBar
                number_of_focus_blocks.text = "$i"
            }

            override fun onStartTrackingTouch(seekBar: SeekBar) {
                // Do something
                Toast.makeText(applicationContext,"Set number of blocks",Toast.LENGTH_SHORT).show()
            }

            override fun onStopTrackingTouch(seekBar: SeekBar) {
                // Do something
                Toast.makeText(applicationContext,"Number of blocks was successfully set",Toast.LENGTH_SHORT).show()
            }
        })

    }

}
