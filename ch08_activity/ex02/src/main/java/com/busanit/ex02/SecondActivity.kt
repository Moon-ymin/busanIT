package com.busanit.ex02

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.busanit.ex02.databinding.ActivitySecondBinding

class SecondActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySecondBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySecondBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonReturnResult.setOnClickListener {
            val result = binding.editTextResult.text.toString()
            val resultIntent = Intent()
            resultIntent.putExtra("RESULT", result)
            setResult(Activity.RESULT_OK, resultIntent)
            finish()
        }
    }
}