package com.busanit.ex03

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.busanit.ex03.databinding.ActivitySecondBinding

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
            setResult(RESULT_OK, resultIntent)
            finish()
        }
    }
}