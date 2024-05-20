package com.busanit.ch00_practice.pr2

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.busanit.ch00_practice.R
import com.busanit.ch00_practice.databinding.ActivityMainBinding
import com.busanit.ch00_practice.databinding.ActivitySecondBinding

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivitySecondBinding.inflate(layoutInflater)
        setContentView(R.layout.activity_second)

        binding.run {
            val extra = intent.getStringExtra("extra_msg")
            textView1.text = extra

            button1.setOnClickListener {
                val resultIntent = Intent()     // 인텐트 객체 생성
                resultIntent.putExtra("result_msg",
                    "$extra, Result from Other Activity")       // 데이터 삽입

                setResult(RESULT_OK, resultIntent)  // 결과 설정
                finish()        // Activity를 종료
            }
        }

    }
}