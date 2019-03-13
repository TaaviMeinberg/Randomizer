package com.example.randomizer

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.SeekBar
import android.widget.TextView
import java.util.*
import android.widget.Toast
import android.widget.SeekBar.OnSeekBarChangeListener




class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton = findViewById<Button>(R.id.rollButton)
        val resultsView = findViewById<TextView>(R.id.resultsTextView)
        val highestSelectedValue = findViewById<TextView>(R.id.highestSelectedValue)

        val seekBar = findViewById<SeekBar>(R.id.seekBar)

        highestSelectedValue.text = seekBar.progress.toString()
        rollButton.setOnClickListener {
            val rand = Random().nextInt(seekBar.progress+1)

            resultsView.text = rand.toString()
        }
        seekBar.setOnSeekBarChangeListener(object : OnSeekBarChangeListener {

            override fun onStopTrackingTouch(seekBar: SeekBar) {
                // TODO Auto-generated method stub
            }

            override fun onStartTrackingTouch(seekBar: SeekBar) {
                // TODO Auto-generated method stub
            }

            override fun onProgressChanged(seekBar: SeekBar, progress: Int, fromUser: Boolean) {
                // TODO Auto-generated method stub
                highestSelectedValue.text = progress.toString()
            }
        });
    }
}
