package com.plum.artifactorydemo

import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.imobpay.artifactorylibrary.HomeActivity


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val tv_hello = findViewById(R.id.tv_hello) as TextView
        tv_hello.setOnClickListener() { v ->
            Toast.makeText(this@MainActivity, "testclick", Toast.LENGTH_LONG)
            startActivity(Intent(this@MainActivity, HomeActivity::class.java))

        }
    }
}
