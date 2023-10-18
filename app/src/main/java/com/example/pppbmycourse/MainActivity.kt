package com.example.pppbmycourse

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import androidx.viewpager2.widget.ViewPager2
import com.example.pppbmycourse.databinding.ActivityMainBinding
import com.google.android.material.tabs.TabLayoutMediator

class MainActivity : AppCompatActivity() {
    lateinit var viewPager2:ViewPager2
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        var binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        title = "Dashboard"
        //supportActionBar?.hide()

        with(binding){
            viewPager.adapter = TabAdapter(this@MainActivity)
            viewPager2 = viewPager

            TabLayoutMediator(tabLayout, viewPager){
                tab, position->
                tab.text = when(position) {
                    0 -> "Home"
                    1 -> "Material"
                    2 -> "Quiz"
                    else -> ""
                }
            }.attach()
        }
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_options, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId){
            R.id.action_home -> {
                Toast.makeText(this, "Home", Toast.LENGTH_SHORT).show()
                viewPager2.setCurrentItem(0)
                true
            }
            R.id.action_materi -> {
                Toast.makeText(this, "Materi", Toast.LENGTH_SHORT).show()
                viewPager2.setCurrentItem(1)
                true
            }
            R.id.action_quiz -> {
                Toast.makeText(this, "Quiz", Toast.LENGTH_SHORT).show()
                viewPager2.setCurrentItem(2)
                true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }
}