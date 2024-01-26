package com.example.counter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var count : Int=0
        val btnIncrease = findViewById<Button>(R.id.btnIncrease)
        val btnDecrease = findViewById<Button>(R.id.btnDecrease)
        val btnReset = findViewById<Button>(R.id.btnReset)
        val output = findViewById<TextView>(R.id.txt)

        btnIncrease.setOnClickListener {
            count++
            output.text = "$count"
        }
        btnDecrease.setOnClickListener{
            if(count==0)
            {
                Toast.makeText(this,"The counter dose not go below 0",Toast.LENGTH_SHORT).show()
            }
            else {
                count--
                output.text = "$count"
            }
        }
        btnReset.setOnClickListener{
            count=0
            output.text="$count"
        }
    }
}