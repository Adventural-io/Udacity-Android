package com.adventural.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import com.adventural.diceroller.utils.rollDice

class MainActivity : AppCompatActivity() {

    lateinit var rollButton: Button
    lateinit var leftDiceImage: ImageView
    lateinit var rightDiceImage: ImageView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rollButton = findViewById(R.id.rollButton)
        leftDiceImage = findViewById(R.id.diceLeftImageView)
        rightDiceImage = findViewById(R.id.diceRightImageView)
        rollButton.setOnClickListener { setDicesImage() }

    }

    private fun setDicesImage() {
        val leftDiceChose = when (rollDice()) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }

        val rightDiceChose = when (rollDice()) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }

        leftDiceImage.setImageResource(leftDiceChose)
        rightDiceImage.setImageResource(rightDiceChose)
    }


}