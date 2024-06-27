package com.busanit.test2

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.busanit.test2.databinding.ActivityMainBinding
import com.busanit.test2.databinding.ActivityResultBinding
import com.google.android.material.tabs.TabLayoutMediator

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    var fragmentList = mutableListOf<Fragment>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        fragmentList.add(FirstFragment())
        fragmentList.add(SecondFragment())
        fragmentList.add(ThirdFragment())

        binding.pager2.adapter = Adapter(this, fragmentList)

        val tabName = arrayOf("First", "Second", "Third")

        binding.run {
            TabLayoutMediator(tabLayout, pager2) {
                tab, position ->
                tab.text = tabName[position]
            }.attach()
        }
    }
    class Adapter(fragmentActivity: FragmentActivity,
        val fragmentList: MutableList<Fragment>) :
        FragmentStateAdapter(fragmentActivity) {
        override fun getItemCount(): Int = 3
        override fun createFragment(position: Int): Fragment {
            return fragmentList[position]
        }
    }
}