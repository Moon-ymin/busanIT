package com.busanit.test1

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.ItemTouchHelper
import androidx.recyclerview.widget.LinearLayoutManager
import com.busanit.test1.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    private val todoList = mutableListOf<ToDo>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // 샘플 데이터 생성
        todoList.add(ToDo("책 주문하기", "코틀린", "교보문고"))
        todoList.add(ToDo("안드로이드 연습 문제 풀기", context = "모듈 9 연습문제"))
        todoList.add(ToDo("알고리즘 문제 풀기", location = "프로그래머스"))
        todoList.add(ToDo("정처기 1단원 문제 풀기", context = "수제비"))
        todoList.add(ToDo("컴퓨터일반 1단원 문제 풀기"))

        val adapter = ToDoAdapter(todoList)
        binding.recyclerView.adapter = adapter
        binding.recyclerView.layoutManager = LinearLayoutManager(this)

        binding.addButton.setOnClickListener {
            val title = binding.editTitle.text.toString()
            val context = binding.editcontext.text.toString()
            val location = binding.editLocation.text.toString()

            val todo = ToDo(title, context, location);
            todoList.add(todo)
            adapter.notifyItemInserted(todoList.size - 1)

            binding.editTitle.text.clear()
            binding.editcontext.text.clear()
            binding.editLocation.text.clear()

        }
        binding.recyclerView.adapter?.notifyDataSetChanged()

        val itemTouchHelper = ItemTouchHelper(ItemTouchHelperCallback(adapter))
        itemTouchHelper.attachToRecyclerView(binding.recyclerView)


    }

}