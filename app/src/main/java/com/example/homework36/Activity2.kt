package com.example.homework36

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class Activity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_2)
        setupFragment2()
    }
    private fun setupFragment2() {
        val transaction = supportFragmentManager.beginTransaction()
        transaction.replace(R.id.container2,FragmentB())

        transaction.commit()
    }

}