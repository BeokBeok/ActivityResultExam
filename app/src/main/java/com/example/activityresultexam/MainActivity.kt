package com.example.activityresultexam

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.activity.invoke
import androidx.activity.result.contract.ActivityResultContracts.StartActivityForResult
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private val startForResult = registerForActivityResult(StartActivityForResult()) { result ->
        if (result.resultCode == RESULT_OK) {
            Toast.makeText(
                this,
                "result data is : ${result.data?.getStringExtra("DETAIL")}",
                Toast.LENGTH_SHORT
            ).show()
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        goDetailActivity()
    }

    private fun goDetailActivity() {
        btn_go_detail.setOnClickListener {
            startForResult(Intent(this, DetailActivity::class.java))
        }
    }
}