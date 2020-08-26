package com.imobpay.artifactorylibrary;

import android.os.Bundle
import android.widget.ImageView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.plum.testartifactorylibrary.R

/**
 * Created by jics on 17/2/28.
 */

class HomeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.layout)
        val tv_hello = findViewById(R.id.imageView) as ImageView


        tv_hello.setOnClickListener({ v ->
            Toast.makeText(
                this@HomeActivity,
                "testclick2",
                Toast.LENGTH_LONG
            ).show();
        });
    }

}


