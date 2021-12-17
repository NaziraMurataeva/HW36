package com.example.homework36

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
  fun onClickActivity1(view: View){
      val intent =Intent(this,Activity2::class.java)
      startActivity(intent)
  }

    fun onClickActivity2(view: View){
        val intent =Intent(this,Activity3::class.java)
        startActivity(intent)

    }
    fun onClickActivity3(view: View){
        val intent =Intent(this,Activity4::class.java)
        startActivity(intent)
        }
}
