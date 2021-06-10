package com.android.example.colormyview

import android.graphics.Color
import android.os.Binder
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.renderscript.ScriptGroup
import android.view.View
import android.widget.TextView
import com.android.example.colormyview.databinding.ActivityMainBinding
import androidx.lifecycle.ViewModel as ViewModel1


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setListeners()
    }

//    private lateinit var binding: ActivityMainBinding
//
//    override fun onCreate( savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        binding = ActivityMainBinding.inflate(layoutInflater)
//        val view = binding.root
//        setContentView(view)
//        setListeners()
//    }


    private fun setListeners() {

        val view1 : View = findViewById(R.id.box_one_text)
        val view2 : View = findViewById(R.id.box_two_text)
        val view3 : View = findViewById(R.id.box_three_text)
        val view4 : View = findViewById(R.id.box_four_text)
        val view5 : View = findViewById(R.id.box_five_text)
        val view6 : View = findViewById(R.id.constranent_layout)

        val clickableViews : List<View> =
            listOf(view1,view2,view3, view4, view5, view6)


        for (item in clickableViews) {
            item.setOnClickListener { makeColored(it) }
        }

    }

    private fun makeColored(view: View){
        when (view.id) {

            //Boxes using Color Colors for background
            //박스의 색깔을 background의 색깔을 사용해라
            R.id.box_one_text -> view.setBackgroundColor(Color.DKGRAY)
            R.id.box_two_text -> view.setBackgroundColor(Color.GRAY)

            //Boxes using Andorid color resources for background
            //박스의 안드로이드 색깔을 background 리소스를 사용해라

            R.id.box_three_text -> view.setBackgroundResource(android.R.color.holo_green_light)
            R.id.box_four_text -> view.setBackgroundResource(android.R.color.holo_green_dark)
            R.id.box_five_text -> view.setBackgroundResource(android.R.color.holo_green_light)

            else -> view.setBackgroundColor(Color.LTGRAY)


        }
    }
}