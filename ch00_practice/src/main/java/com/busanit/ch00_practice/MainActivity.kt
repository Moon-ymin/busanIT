package com.busanit.ch00_practice

import android.graphics.Color
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.busanit.ch00_practice.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.toolbar.run {
            title = "연락처"
            setTitleTextColor(Color.WHITE)
            inflateMenu(R.menu.menu1)
            setOnMenuItemClickListener {
                when (it.itemId) {
                    R.id.search -> {
                        Toast.makeText(this@MainActivity,
                            "검색 버튼을 눌렀습니다.", Toast.LENGTH_SHORT).show()
                        false
                    }
                    R.id.add -> {
                        Toast.makeText(this@MainActivity,
                            "추가 버튼을 눌렀습니다.", Toast.LENGTH_SHORT).show()
                        false
                    }
                    R.id.message -> {
                        Toast.makeText(this@MainActivity,
                            "메시지 전송을 눌렀습니다.", Toast.LENGTH_SHORT).show()
                        false
                    }
                    R.id.call -> {
                        Toast.makeText(this@MainActivity,
                            "전화 버튼을 눌렀습니다.", Toast.LENGTH_SHORT).show()
                        false
                    }
                    else -> false
                }
            }
        }
    }
}
/*
    5. `MainActivity`에서 `onCreateOptionsMenu`와 `onOptionsItemSelected` 메서드를 오버라이드하여
     메뉴를 설정하고 클릭 이벤트를 처리하세요.
     */