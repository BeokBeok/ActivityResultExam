package com.example.activityresultexam

import android.app.Activity
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class FinalActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_final)
    }

    override fun onBackPressed() {
        setResult(Activity.RESULT_OK, intent.putExtra("message", "FinalActivity to SecondFragment"))
        super.onBackPressed()
    }
}