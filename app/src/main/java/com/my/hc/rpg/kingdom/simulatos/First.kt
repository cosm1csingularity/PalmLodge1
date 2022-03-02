package com.my.hc.rpg.kingdom.simulatos

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class First : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_first)
    }
    fun start(view: View) {
        Intent(applicationContext, PLGPlay::class.java).also { startActivity(it) }
        finish()
    }
}