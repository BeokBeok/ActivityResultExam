package com.example.activityresultexam

import android.app.Activity
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
    }

    override fun onBackPressed() {
        setResult(Activity.RESULT_OK, intent.putExtra("message", "SecondActivity to MainActivity"))
        super.onBackPressed()
    }
}