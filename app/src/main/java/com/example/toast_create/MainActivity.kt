package com.example.toast_create

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val downloadButton = findViewById<Button>(R.id.downloadBtn);
        val uploadButton = findViewById<Button>(R.id.uploadBtn);



        downloadButton.setOnClickListener{
            Toast.makeText(applicationContext,"downloading...",Toast.LENGTH_SHORT).show();

        }

        uploadButton.setOnClickListener{
            Toast.makeText(applicationContext,"uploading...",Toast.LENGTH_SHORT).show();
        }


    }
}