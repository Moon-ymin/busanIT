package com.busanit.test2

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.busanit.test2.databinding.ItemViewBinding

class ListAdapter(val itemList: MutableList<Item>) :
    RecyclerView.Adapter<ListAdapter.ListViewHolder>() {
    inner class ListViewHolder(val binding: ItemViewBinding) :
        RecyclerView.ViewHolder(binding.root) {

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListViewHolder {
        val binding = ItemViewBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ListViewHolder(binding)
    }

    override fun getItemCount(): Int = itemList.size

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        holder.binding.run {
            textView.text = itemList[position].text
        }
    }
}