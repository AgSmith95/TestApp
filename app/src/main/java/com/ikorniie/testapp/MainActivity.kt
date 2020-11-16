package com.ikorniie.testapp

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton: Button = findViewById(R.id.rollButton)
        rollButton.setOnClickListener {
            rollDice()
        }

    }

    private fun rollDice() {
        val diceImage: ImageView = findViewById(R.id.diceImage)

        val num = Random.nextInt(1,7)
        val resourceId = this.resources.getIdentifier("dice_${num}", "drawable", this.packageName)

        diceImage.setImageResource(resourceId)
        diceImage.contentDescription = "You rolled $num"
    }
}