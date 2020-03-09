package com.invitech.kotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    lateinit var imageview:ImageView
    lateinit var rollbtn:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        imageview = findViewById(R.id.diceimage)
        rollbtn = findViewById(R.id.rolldice)

        rollbtn.setOnClickListener{
            rollDice()
        }

    }

    private fun rollDice() {
          var random:Int = Random.nextInt(6)+1
        var drawableresouce = when(random){
            1->R.drawable.dice_1
            2->R.drawable.dice_2
            3->R.drawable.dice_3
            4->R.drawable.dice_4
            5->R.drawable.dice_5
            else ->R.drawable.dice_6
        }
        imageview.setImageResource(drawableresouce)
    }

}
