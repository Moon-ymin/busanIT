package com.busanit.test1

import android.content.Intent
import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.busanit.test1.databinding.TodoBinding
import java.util.Collections

class ToDoAdapter(val todoList: MutableList<ToDo>) :
    RecyclerView.Adapter<ToDoAdapter.TodoViewHolder>() {

    inner class TodoViewHolder(val binding: TodoBinding) :
         RecyclerView.ViewHolder(binding.root) {

         fun bind(todo: ToDo) {
             // 데이터 전달
             binding.run{
                 titleView.text = todo.title
                 contentView.text = todo.context
                 locationView.text = todo.location

                 val context = binding.root.context as MainActivity

                 detailButton.setOnClickListener {
                     val intent = Intent(context, DetailActivity::class.java).apply {
                         val title = titleView.text.toString()
                         val con = contentView.text.toString()
                         val lo = locationView.text.toString()

                         putExtra("title",title )
                         putExtra("con", con)
                         putExtra("lo", lo)
                     }
                     //Log.d("TAG", "bind: aaa")
                     context.startActivity(intent)
                 }

             }
         }


    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TodoViewHolder {
        val binding = TodoBinding.inflate(LayoutInflater.from(parent.context), parent,
            false)
        return TodoViewHolder(binding)
    }

    override fun onBindViewHolder(holder: TodoViewHolder, position: Int) {
        holder.binding.run {
            titleView.text = todoList[position].title
        }
        holder.bind(todoList[position])
    }

    override fun getItemCount(): Int = todoList.size

    fun moveItem(fromPosition: Int, toPosition: Int) {
        Collections.swap(todoList, fromPosition, toPosition)
        notifyItemMoved(fromPosition, toPosition)
    }
    fun deleteItem(position: Int){
        todoList.removeAt(position)
        notifyItemRemoved(position)
    }


}