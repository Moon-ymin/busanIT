package com.busanit.ex01

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.busanit.ex01.databinding.ActivitySecondBinding

class SecondActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySecondBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySecondBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val message = intent.getStringExtra("MESSAGE")
        binding.textViewReceivedMessage.text = message

        binding.buttonReply.setOnClickListener {
            val reply = binding.editTextReply.text.toString()
            val replyIntent = Intent()
            replyIntent.putExtra("REPLY", reply)
            setResult(Activity.RESULT_OK, replyIntent)
            finish()
        }
    }
}