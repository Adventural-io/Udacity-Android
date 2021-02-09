package com.adventural.diceroller

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.adventural.diceroller.databinding.ActivityMainBinding
import com.adventural.diceroller.utils.rollDice

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main)

        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        binding.rollButton.setOnClickListener { setDicesImage() }

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

        binding.apply {
            diceLeftImageView.setImageResource(leftDiceChose)
            diceRightImageView.setImageResource(rightDiceChose)
        }
    }


}