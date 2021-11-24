package com.lylx.learnfeature

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_main)
    findViewById<View>(R.id.btn_activity_result).setOnClickListener {
      startActivity(Intent(this, ResultActivity::class.java))
    }
  }
}
