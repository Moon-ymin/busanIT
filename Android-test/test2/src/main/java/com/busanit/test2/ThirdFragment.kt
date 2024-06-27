package com.busanit.test2

import android.app.Activity
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.activity.result.contract.ActivityResultContracts
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import com.busanit.test2.databinding.FragmentSecondBinding
import com.busanit.test2.databinding.FragmentThirdBinding

class ThirdFragment : Fragment() {
    lateinit var binding: FragmentThirdBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentThirdBinding.inflate(inflater, container, false)
        val context = binding.root.context as MainActivity
        val intent = Intent(context, ResultActivity::class.java)

        val launcher = registerForActivityResult(ActivityResultContracts.StartActivityForResult()) { result ->
            if (result.resultCode == Activity.RESULT_OK) {
                val returnMsg = result.data?.getStringExtra("return")
                returnMsg?.let {
                    binding.textView.text = it
                }
            }
        }

        binding.button.setOnClickListener {
            launcher.launch(intent)
        }

        return binding.root
    }


}