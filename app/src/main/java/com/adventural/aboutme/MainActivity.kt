package com.adventural.aboutme

import android.content.Context
import android.os.Bundle
import android.view.View
import android.view.inputmethod.InputMethodManager
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.adventural.aboutme.databinding.ActivityMainBinding
import com.adventural.aboutme.entitiy.MyName

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    private val myName = MyName("Quan")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main)

        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        binding.myName = myName

        binding.doneButton.setOnClickListener {
            setNickName(it)
        }
    }

    private fun setNickName(view: View) {
        binding.apply {
            nicknameText.text = nicknameEdit.text.toString()
            nicknameText.visibility = View.VISIBLE
            nicknameEdit.visibility = View.GONE
            doneButton.visibility = View.GONE

            // Hide the keyboard.
            val imm = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
            imm.hideSoftInputFromWindow(view.windowToken, 0)
        }
    }
}