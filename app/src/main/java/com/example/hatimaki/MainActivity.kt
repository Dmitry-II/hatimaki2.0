package com.example.hatimaki

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//      _______________________________________________________________________________________________________
        val navigationBar = findViewById<BottomNavigationView>(R.id.bottom_navigation)
//        обработка кликов по кнопкам навигационного меню
        navigationBar.setOnItemSelectedListener { item ->

            when (item.itemId) {
                R.id.navigation_home -> {
                    supportFragmentManager.beginTransaction()
                        .replace(R.id.fragment_container, mainFragment())
                        .commit()
                    true
                }


                R.id.navigation_cart -> {
                    supportFragmentManager.beginTransaction()
                        .replace(R.id.fragment_container, cartFragment())
                        .commit()
                    true
                }


                R.id.navigation_profile -> {
                    supportFragmentManager.beginTransaction()
                        .replace(R.id.fragment_container, profileFragment())
                        .commit()
                    true
                }
                // ... другие пункты
                else -> false
            }
        }

        if (savedInstanceState == null) {
            navigationBar.selectedItemId = R.id.navigation_home
        }
//        конец обработки кликов по кнопкам навигационного меню
//      -------------------------------------------------------------------------------------------------------


    }
}