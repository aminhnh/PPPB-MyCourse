package com.example.pppbmycourse

import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter

class TabAdapter (activity: AppCompatActivity) : FragmentStateAdapter(activity) {
    val page = arrayOf<Fragment>(
        HomeFragment(),
        MateriFragment(),
        QuizFragment()
    )

    override fun getItemCount(): Int {
        return page.size
    }

    override fun createFragment(position: Int): Fragment {
        return page[position]
    }
}