package com.my.hc.rpg.kingdom.simulatos

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.view.isVisible
import kotlinx.android.synthetic.main.activity_plgplay.*

class PLGPlay : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_plgplay)

        finishButton.setOnClickListener {
            Intent(applicationContext, Final::class.java).also { startActivity(it) }
            finish()
        }

        leaf1.setOnClickListener {
            leaf1.setImageResource(R.drawable.pineapple)
            bananaTxt.setText("Ew! Pineapple!")
        }

        leaf2.setOnClickListener {
            leaf2.setImageResource(R.drawable.mango)
            bananaTxt.setText("That's no-no!")
        }

        leaf3.setOnClickListener {
            leaf3.setImageResource(R.drawable.banana)
            finishButton.isVisible = true
            bananaTxt.setText("Yeah, banana!\nIt's a banana!")
        }

        leaf4.setOnClickListener {
            leaf4.setImageResource(R.drawable.coconut)
            bananaTxt.setText("I don't like it!")
        }

        leaf5.setOnClickListener {
            leaf5.setImageResource(R.drawable.dragonfruit)
            bananaTxt.setText("What else is this?")
        }

        leaf6.setOnClickListener {
            leaf6.setImageResource(R.drawable.watermelon)
            bananaTxt.setText("Is it water or melon?")
        }
    }
}