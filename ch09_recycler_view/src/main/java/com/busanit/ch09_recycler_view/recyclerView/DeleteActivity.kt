package com.busanit.ch09_recycler_view.recyclerView

import android.os.Bundle
import android.view.ViewGroup
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.busanit.ch09_recycler_view.databinding.ActivityDeleteBinding
import com.busanit.ch09_recycler_view.databinding.StudentItemBinding

// 연습문제 : InsertActivity의 리사이클러뷰에서
// 각 아이템마다 `삭제` 버튼을 추가합니다.
// 아이템의 `삭제`버튼이 클릭될 때 해당 아이템이 리사이클러뷰에서 삭제되도록 구현하세요

class DeleteActivity : AppCompatActivity() {

    // 1. 데이터 클래스(모델)을 정의
    data class Student(var name: String, var age: Int, var grade: Int)
    val studentList = mutableListOf<Student>()
    override fun onCreate(savedInstanceState: Bundle?) {
        // 2. 레이아웃을 설정
        super.onCreate(savedInstanceState)

        val binding = ActivityDeleteBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // 어댑터와 레이아웃 매니저 설정
        binding.run {
            recyclerView.adapter = MyRecyclerAdapter()
            recyclerView.layoutManager = LinearLayoutManager(this@DeleteActivity)
            recyclerView.addItemDecoration(DividerItemDecoration(this@DeleteActivity,
                DividerItemDecoration.VERTICAL))

            // 추가 버튼이 클릭되었을 때
            addButton.setOnClickListener {
                val name = editTextName.text.toString()
                val age = editTextAge.text.toString().toInt()
                val grade = editTextGrade.text.toString().toInt()

                // 입력된 값으로 객체 생성
                val student = Student(name, age, grade)

                // 데이터 리스트에 추가
                studentList.add(student)

                // 입력 필드를 초기화
                editTextName.setText("")
                editTextAge.setText("")
                editTextGrade.setText("")

                // 어댑터에 데이터 변경사실을 알림
                recyclerView.adapter?.notifyDataSetChanged()

                // 특정위치에 아이템이 제거됨
                val position = 1 // 위치를 알 경우
                recyclerView.adapter?.notifyItemRemoved(position)
            }

            // 삭제 버튼이 클릭되었을 때
            deleteButton.setOnClickListener {
                val name = editTextName.text.toString()
                val age = editTextAge.text.toString().toInt()
                val grade = editTextGrade.text.toString().toInt()

                val student = Student(name, age, grade) // 입력된 값으로 객체 생성

                studentList.remove(student) // 리스트에 데이터 삭제

                // 입력 필드를 초기화
                editTextName.setText("")
                editTextAge.setText("")
                editTextGrade.setText("")

                // 어댑터에 데이터 변경사실을 알림
                recyclerView.adapter?.notifyDataSetChanged()

                // 특정위치에 아이템이 제거됨
                val position = 1 // 위치를 알 경우
                recyclerView.adapter?.notifyItemRemoved(position)

            }
        }
    }

    // 3. 뷰 홀더와 어댑터 정의
    inner class MyRecyclerAdapter() :
        RecyclerView.Adapter<RecyclerView.ViewHolder>() {

        // 뷰 홀더 정의
        inner class MyViewHolder(val itemBinding: StudentItemBinding) :
            RecyclerView.ViewHolder(itemBinding.root) {
            // 각 View(TextView)의 주소값을 담을 변수
            var textViewName: TextView
            var textViewAge: TextView
            var textViewGrade: TextView

            init {
                // 뷰 홀더가 생성될 때 뷰 바인딩을 통해 초기화
                textViewName = itemBinding.textViewName
                textViewAge = itemBinding.textViewAge
                textViewGrade = itemBinding.textViewGrade
            }
        }

        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
            val itemBinding = StudentItemBinding.inflate(layoutInflater, parent, false)
            return MyViewHolder(itemBinding)
        }

        override fun getItemCount(): Int = studentList.size

        override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
            val (name, age, grade) = studentList[position]

            // 뷰홀더에 데이터 바인딩
            val myHolder = (holder as MyViewHolder).run {
                textViewName.text = name
                textViewAge.text = "${age}세"
                textViewGrade.text = "${grade}점"
            }
        }


    }
}