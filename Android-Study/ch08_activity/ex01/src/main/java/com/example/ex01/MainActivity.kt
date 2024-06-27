package com.example.ex01

import android.content.Intent
import android.os.Bundle
import android.view.inputmethod.InputBinding
import androidx.activity.enableEdgeToEdge
import androidx.activity.result.contract.ActivityResultContracts
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.ex01.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    val REQUEST_CODE = 30
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.run {

            // 문제 1 : 데이터 전달
            button.setOnClickListener {
                val intent = Intent(this@MainActivity, SecondActivity::class.java).apply {
                    val msg = editText.text.toString()
                    putExtra("msg", msg)
                }
                startActivity(intent)
            }
            // 문제 2 : 데이터 전달
            button2.setOnClickListener {
                val intent = Intent(this@MainActivity, SecondActivity::class.java).apply {
                    val msg = editText.text.toString()
                    putExtra("msg", msg)
                }
                startActivityForResult(intent, REQUEST_CODE)
            }
            // 문제 3 : Result API
            val contract = ActivityResultContracts.StartActivityForResult()
            val launcher = registerForActivityResult(contract) {
                if (it.resultCode == RESULT_OK) {
                    val returnMsg = it.data?.getStringExtra("return_msg")
                    binding.textView.text = returnMsg
                }
            }

            button3.setOnClickListener {
                val intent = Intent(this@MainActivity, SecondActivity::class.java).apply {
                    val msg = editText.text.toString()
                    putExtra("msg", msg)
                }
                launcher.launch(intent)
            }

        }
    }
    // 문제 2
    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if(resultCode == RESULT_OK) {
            when(requestCode) {
                REQUEST_CODE -> {
                    binding.textView.text = data?.getStringExtra("return_msg")
                }
            }
        }
    }
}