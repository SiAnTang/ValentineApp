package com.example.siantang.valentine

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.example.siantang.valentine.R.layout.*
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(activity_main)

        firstPage.setOnClickListener {
            val ran = (Math.random()*4).toInt()
            if(ran <= 0)      secondPage()
            else if(ran>0 || ran<=1) thirdPage()
            else if(ran>1 || ran<=2) fourthPage()
            else fifthPage()
        }
    }
    private fun secondPage(){
        val intent = Intent(this, second_page::class.java)
        startActivity(intent) }
    private fun thirdPage(){
        val intent = Intent(this, third_page::class.java)
        startActivity(intent)
    }private fun fourthPage(){
        val intent = Intent(this, fourth_page::class.java)
        startActivity(intent)
    }private fun fifthPage(){
        val intent = Intent(this, fifth_page::class.java)
        startActivity(intent)
    }
}


