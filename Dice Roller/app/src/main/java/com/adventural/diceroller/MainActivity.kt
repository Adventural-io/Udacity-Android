package com.adventural.diceroller

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.adventural.diceroller.databinding.ActivityMainBinding
import com.adventural.diceroller.entity.Dice

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main)

        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        binding.rollButton.setOnClickListener { rollDice() }

        rollDice()

    }

    /**
     * Roll the dice
     */
    private fun rollDice() {
        // Create new Dice object with 6 sides and roll the dice
        val dice = Dice(6)
        val leftDiceRoll = dice.roll()
        val leftDiceNumber = when (leftDiceRoll) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }

        binding.leftDiceImage.contentDescription = leftDiceNumber.toString()

        val rightDiceRoll = dice.roll()

        val rightDiceNumber = when (rightDiceRoll) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }

        binding.rightDiceImage.contentDescription = leftDiceNumber.toString()

        binding.apply {
            leftDiceImage.setImageResource(leftDiceNumber)
            rightDiceImage.setImageResource(rightDiceNumber)
            resultText.text = "The result is " + (leftDiceRoll + rightDiceRoll)
        }

    }


}