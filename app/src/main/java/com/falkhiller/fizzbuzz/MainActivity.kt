package com.falkhiller.fizzbuzz

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.method.ScrollingMovementMethod
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        result.movementMethod = ScrollingMovementMethod()


         button.setOnClickListener {

             val fizzt = fizz.text.toString()
             val buzzt = buzz.text.toString()
             var myText = ""

             for(i in 1..100){
                 if(i%3 == 0){
                     myText += fizzt
                 }
                 if(i % 5  == 0){
                     myText += buzzt
                 }
                 if(i%3 * i%5 > 0){
                     myText+= i.toString()
                 }
                 myText+=("\n")
             }
             result.setText(myText!!)


         }



    }
}
