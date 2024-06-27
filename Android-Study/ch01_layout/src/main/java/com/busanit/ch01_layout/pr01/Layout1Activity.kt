package com.busanit.ch01_layout.pr01

import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.busanit.ch01_layout.R

class Layout1Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)



        setContentView(R.layout.activity_layout1)

        // 리소스의 id값으로 뷰 객체를 얻음
        val button1: Button= findViewById<Button>(R.id.button1) // R: 리소스, activity_layout1.xml
                                                                // Button은 둘 중 한 번만 적어도 됨
        val button2 = findViewById<Button>(R.id.button2)
        val button3: Button= findViewById<Button>(R.id.button3)
        val button4: Button= findViewById<Button>(R.id.button4)

        button1.setOnClickListener {
            println("버튼 1번 클릭, 버튼 2번 안보이게")
            button2.visibility = View.INVISIBLE
        }

        button3.setOnClickListener {
            println("버튼 3번 클릭, 버튼 2번 보이게")
            button2.visibility = View.VISIBLE
        }
        

    }
}