package com.example.homework19

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onStart() {
        super.onStart()
        var clickCount = 0
        btn.setOnClickListener {
            openFragment(++clickCount)
        }
    }

    private fun openFragment(clickCount: Int) {
        val fragmentManager = supportFragmentManager
        val fragmentTransaction = fragmentManager.beginTransaction()
        when (clickCount) {
            1 -> fragmentTransaction.replace(R.id.container, FirstFragment.newInstance())
            2 -> fragmentTransaction.replace(R.id.container, SecondFragment.newInstance())
            3 -> fragmentTransaction.replace(R.id.container, ThirdFragment.newInstance())
        }
        fragmentTransaction.commit()
    }
}