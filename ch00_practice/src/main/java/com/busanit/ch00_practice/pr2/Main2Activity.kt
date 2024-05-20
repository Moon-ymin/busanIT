package com.busanit.ch00_practice.pr2

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.busanit.ch00_practice.R
import com.busanit.ch00_practice.databinding.ActivityMain2Binding

class Main2Activity : AppCompatActivity() {
    lateinit var binding: ActivityMain2Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMain2Binding.inflate(layoutInflater)
        setContentView(R.layout.activity_main2)

        binding.run {
            send.setOnClickListener {

                val intent = Intent(this@Main2Activity, SecondActivity::class.java).apply {
                    intent.putExtra("extra_msg", editText.text)
                }

                startActivity(intent);
            }
        }
    }
}