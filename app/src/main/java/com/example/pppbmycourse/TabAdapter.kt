package com.example.pppbmycourse

import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter

class TabAdapter (activity: AppCompatActivity) : FragmentStateAdapter(activity) {
    override fun getItemCount(): Int {
        return 3
    }

    override fun createFragment(position: Int): Fragment {
        return when (position){
            0 -> HomeFragment()
            1 -> MateriFragment()
            2 -> QuizFragment()
            else -> throw IllegalArgumentException("Position out of array")
        }

    }
}