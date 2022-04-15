package com.example.bouataminemohammed

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import java.util.*
import kotlin.concurrent.schedule

class Album : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_album)

        val profileName=intent.getStringExtra("Username")
    }

   val images = arrayOf(R.drawable.cow,R.drawable.zepro,R.drawable.cat,R.drawable.dog,R.drawable.bear,R.drawable.goat,R.drawable.fouq,R.drawable.hippo,R.drawable.owl,R.drawable.qoula)


    fun Next(view: View) {
            this@Album.runOnUiThread(java.lang.Runnable {
                findViewById<ImageView>(R.id.albumimage).setImageResource(images[(images.indices).random()])

            })
    }
    fun index (view: View){

       var hh = findViewById<ImageView>(R.id.albumimage)
        var i = 0
        for( image in images){
              i++




        }

    }


    fun pre(view: View) {
        this@Album.runOnUiThread(java.lang.Runnable {
            findViewById<ImageView>(R.id.albumimage).setImageResource(images[(images.indices).random()])
        })
    }





}