package com.example.bouataminemohammed

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView

class MainAlbum : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_album)

    }

    fun sen (view : View){

       var o = Intent(this,Album::class.java).also { startActivity(it)}
        o.putExtra("intVariableName", intValue);







    }
}



