package com.example.family

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.family.fragment.GuardFragment
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val bottomBar = findViewById<BottomNavigationView>(R.id.bottom_bar)

        bottomBar.setOnItemSelectedListener {

            if(it.itemId == R.id.nav_guard){
                inflateGuardFragment()
            }else if (it.itemId ==R.id.nav_home){
                inflateHomeFragment()
            }


            true
        }
    }

    private fun inflateHomeFragment() {

    }

    private fun inflateGuardFragment() {
        val transaction = supportFragmentManager.beginTransaction()
        transaction.replace(R.id.container, GuardFragment.newInstance())
        transaction.commit()
    }
}