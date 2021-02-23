package com.adventural.diceroller.entity

class Dice(private val number: Int) {
    fun roll(): Int{
        return (1..number).random()
    }
}