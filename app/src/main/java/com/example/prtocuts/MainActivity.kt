package com.example.prtocuts

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

import com.example.prtocuts.databinding.ActivityMainBinding
import com.example.prtocuts.SecendActivity as SecendActivity1

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setContentView(R.layout.activity_main)
        val actionBar = supportActionBar
        actionBar!!.title = "prudcts Show"


        binding.button.setOnClickListener {
            val intent = Intent(this, com.example.prtocuts.SecendActivity::class.java)
            startActivity(intent)
            binding.button2.setOnClickListener {
                val intent: Intent = Intent(this, thierd::class.java)
                startActivity(intent)
                binding.button3.setOnClickListener {
                    val intent: Intent =
                        Intent(this, com.example.prtocuts.SecendActivity::class.java)
                    startActivity(intent)
                    binding.button4.setOnClickListener {
                        val intent: Intent = Intent(this, thierd::class.java)
                        startActivity(intent)
                        binding.button5.setOnClickListener {
                            val intent: Intent =
                                Intent(this, com.example.prtocuts.SecendActivity::class.java)
                            startActivity(intent)
                            binding.button6.setOnClickListener {
                                val intent: Intent =
                                    Intent(this, com.example.prtocuts.SecendActivity::class.java)
                                startActivity(intent)
                            }
                        }
                    }
                }

            }
        }
    }
}
