package com.example.prtocuts

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class SecendActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_secend)

        val actionBar = supportActionBar
        actionBar !! .title= "Ditels Prodect"
        actionBar.setDisplayHomeAsUpEnabled(true)

    }
}