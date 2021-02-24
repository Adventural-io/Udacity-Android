package io.zerod.tipcalculator

import android.content.Context
import android.os.Bundle
import android.view.KeyEvent
import android.view.View
import android.view.inputmethod.InputMethodManager
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import io.zerod.tipcalculator.databinding.ActivityMainBinding
import java.text.NumberFormat

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main)

        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        setContentView(binding.root)

        displayTip("")

        binding.calculateButton.setOnClickListener { calculateTip(it) }

        binding.costOfServiceEditText.setOnKeyListener { view, keyCode, _ ->
            handleKeyEvent(
                view,
                keyCode
            )
        }

    }

    private fun calculateTip(view: View) {
        val costAmount = binding.costOfServiceEditText.text.toString().toDoubleOrNull()

        if (costAmount == null) {
            displayTip("")
            return
        }

        val tipPercent = when (binding.serviceRatingRadioGroup.checkedRadioButtonId) {
            binding.amazingRadioButton.id -> 0.2
            binding.goodRadioButton.id -> 0.18
            binding.okRadioButton.id -> 0.15
            else -> 0.15
        }

        val isRoundUp = binding.roundUpSwitch.isChecked

        var tip = costAmount * tipPercent

        if (isRoundUp) {
            tip = kotlin.math.ceil(costAmount * tipPercent)
        }

        val formattedTip = NumberFormat.getCurrencyInstance().format(tip)

        closeKeyboard(view)

        displayTip(formattedTip)
    }

    private fun displayTip(formattedTip: String) {
        binding.apply {
            tipAmountText.text = getString(R.string.tip_amount, formattedTip)
        }
    }

    private fun handleKeyEvent(view: View, keyCode: Int): Boolean {
        if (keyCode == KeyEvent.KEYCODE_ENTER) {
            // Hide the keyboard
            closeKeyboard(view)
            return true
        }
        return false
    }

    private fun closeKeyboard(view: View) {
        val inputMethodManager =
            getSystemService(INPUT_METHOD_SERVICE) as InputMethodManager
        inputMethodManager.hideSoftInputFromWindow(view.windowToken, 0)
    }
}