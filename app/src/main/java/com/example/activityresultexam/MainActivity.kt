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
                "result data is : ${result.data?.getStringExtra("message")}",
                Toast.LENGTH_SHORT
            ).show()
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        title = "MainActivity"

        navigate()
    }

    private fun navigate() {
        btn_go_activity.setOnClickListener {
            startForResult(Intent(this, SecondActivity::class.java))
        }
        btn_go_fragment.setOnClickListener {
            startForResult(Intent(this, SecondFragmentActivity::class.java))
        }
    }
}