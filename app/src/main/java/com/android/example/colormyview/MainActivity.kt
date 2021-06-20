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
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setListeners()
    }

    private fun setListeners() {
        var clickableViews: List<View> =
            listOf(box_one_text, box_two_text, box_three_text, box_four_text, box_five_text,
                constranent_layout,
                red_button, yellow_button, green_button)
        for(item in clickableViews) {
            item.setOnClickListener{ makeColored(it) }
        }
    }

    private fun makeColored(view: View) {
        when (view.id) {

            // Boxes using Color class colors for background
            R.id.box_one_text -> view.setBackgroundColor(Color.DKGRAY)
            R.id.box_two_text -> view.setBackgroundColor(Color.GRAY)

            // Boxes using Android color resources for background
            R.id.box_three_text -> view.setBackgroundResource(android.R.color.holo_green_light)
            R.id.box_four_text -> view.setBackgroundResource(android.R.color.holo_green_dark)
            R.id.box_five_text -> view.setBackgroundResource(android.R.color.holo_green_light)

            // Boxes using custon colors for background
            R.id.red_button -> box_three_text.setBackgroundResource(R.color.my_red)
            R.id.yellow_button -> box_four_text.setBackgroundResource(R.color.my_yellow)
            R.id.green_button -> box_five_text.setBackgroundResource(R.color.my_green)

            else -> view.setBackgroundColor(Color.LTGRAY)
        }
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


//    private fun setListeners() {
//
//        val view1 : View = findViewById(R.id.box_one_text)
//        val view2 : View = findViewById(R.id.box_two_text)
//        val view3 : View = findViewById(R.id.box_three_text)
//        val view4 : View = findViewById(R.id.box_four_text)
//        val view5 : View = findViewById(R.id.box_five_text)
//        val view6 : View = findViewById(R.id.constranent_layout)
//        val view7 : View = findViewById(R.id.red_button)
//        val view8 : View = findViewById(R.id.yellow_button)
//        val view9 : View = findViewById(R.id.green_button)
//
//        val clickableViews : List<View> =
//            listOf(view1,view2,view3, view4, view5, view6
//            , view7, view8, view9)
//
//
//        for (item in clickableViews) {
//            item.setOnClickListener { makeColored(it) }
//        }
//
//    }
//
//    private fun makeColored(view: View){
//        when (view.id) {
//
//            //Boxes using Color Colors for background
//            //박스의 색깔을 background의 색깔을 사용해라
//            R.id.box_one_text -> view.setBackgroundColor(Color.DKGRAY)
//            R.id.box_two_text -> view.setBackgroundColor(Color.GRAY)
//
//            //Boxes using Andorid color resources for background
//            //박스의 안드로이드 색깔을 background 리소스를 사용해라
//
//            R.id.box_three_text -> view.setBackgroundResource(android.R.color.holo_green_light)
//            R.id.box_four_text -> view.setBackgroundResource(android.R.color.holo_green_dark)
//            R.id.box_five_text -> view.setBackgroundResource(android.R.color.holo_green_light)
//
//            //Boxes using custom colors for background
//
//            R.id.red_button -> box_three_text.setBackgroundResource(R.color.my_red)
//            R.id.yellow_button -> box_four_text.setBackgroundResource(R.color.my_yellow)
//            R.id.green_button -> box_five_text.setBackgroundResource(R.color.my_green)
//
//            else -> view.setBackgroundColor(Color.LTGRAY)
//
//
//        }
//    }
//}
}
