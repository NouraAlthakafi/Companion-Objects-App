package com.example.companionobjectsapp

import android.view.View


class BackgroundTime{
    companion object{
        val day = "day"
        val night = "night"
        fun BackgroundChange(layout: View, day:String){
            when (day){
                "day" -> {layout.setBackgroundResource(R.drawable.day)}
                "night" -> {layout.setBackgroundResource(R.drawable.night)}
            }
            }
        }
    }