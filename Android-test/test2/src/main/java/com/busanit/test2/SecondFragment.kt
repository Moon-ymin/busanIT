package com.busanit.test2

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AlertDialog
import com.busanit.test2.databinding.FragmentSecondBinding

class SecondFragment : Fragment() {
    lateinit var binding: FragmentSecondBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentSecondBinding.inflate(inflater, container, false)
        val context = binding.root.context as MainActivity
        binding.button.setOnClickListener {
            val builder = AlertDialog.Builder(context)
            builder.apply {
                setTitle("기본")
                setMessage("안녕하세요")
            }
            builder.show()
        }
        return binding.root
    }
}