package com.example.companionobjectsapp

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import com.example.companionobjectsapp.BackgroundTime.Companion.BackgroundChange
import com.example.companionobjectsapp.BackgroundTime.Companion.day

class MainActivity : AppCompatActivity() {
    lateinit var clMain: ConstraintLayout
    lateinit var tvBack: TextView
    lateinit var etTime: EditText
    lateinit var buttonCh: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        clMain = findViewById(R.id.clMain)
        tvBack = findViewById(R.id.tvBack)
        etTime = findViewById(R.id.etTime)
        buttonCh = findViewById(R.id.button)
        buttonCh.setOnClickListener(object: View.OnClickListener{
            override fun onClick(p0: View?) {
                if(etTime.text.toString().toLowerCase() == "day"){
                    val theDayT = BackgroundTime
                    theDayT.BackgroundChange(clMain, theDayT.day)
                    tvBack.setTextColor(Color.BLACK)
                    etTime.setTextColor(Color.BLACK)
                    buttonCh.setBackgroundColor(Color.BLACK)
                    buttonCh.setTextColor(Color.WHITE)
                }
                if(etTime.text.toString().toLowerCase() == "night"){
                    val theNightT = BackgroundTime
                    theNightT.BackgroundChange(clMain, theNightT.night)
                    tvBack.setTextColor(Color.WHITE)
                    etTime.setTextColor(Color.WHITE)
                    buttonCh.setBackgroundColor(Color.WHITE)
                    buttonCh.setTextColor(Color.BLACK)
                }
            }

        })
    }
    object someJob {
        const val TAG = "MainActivity"
    }
}