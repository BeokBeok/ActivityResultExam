package com.example.activityresultexam

import android.app.Activity
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class DetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)
    }

    override fun onBackPressed() {
        setResult(Activity.RESULT_OK, intent.putExtra("DETAIL", "DETAIL"))
        super.onBackPressed()
    }
}