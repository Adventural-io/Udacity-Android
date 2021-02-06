package com.adventural.diceroller.utils

fun rollDice(): Int {
    return (Math.random() * 6 + 1).toInt()
}