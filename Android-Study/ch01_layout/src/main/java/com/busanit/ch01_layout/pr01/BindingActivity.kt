package com.busanit.ch01_layout.pr01

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.busanit.ch01_layout.databinding.ActivityBindingBinding

class BindingActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // 바인딩 객체 획득
        val binding = ActivityBindingBinding.inflate(layoutInflater)

        // 바인딩 객체로 화면을 출력
        setContentView(binding.root)

        // xml 의 요소들을 뷰 객체로 선언할 필요 없이
        binding.visibleButton.setOnClickListener {
            binding.targetView.visibility = View.VISIBLE
        }

        binding.invisibleButton.setOnClickListener {
            binding.targetView.visibility = View.INVISIBLE
        }

        // findViewById를 사용하지 않고 뷰 객체 사용

        /*val invisibleButton = findViewById<Button>(R.id.invisibleButton)
        val visibleButton = findViewById<Button>(R.id.visibleButton)
        val targetView = findViewById<TextView>(R.id.targetView)*/

    }
}