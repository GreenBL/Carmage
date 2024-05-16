package com.pwm.carmage

import android.os.Bundle
import android.service.voice.VoiceInteractionSession.ActivityId
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.pwm.carmage.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityMainBinding.inflate(layoutInflater)
        val root = binding.root
        setContentView(root)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val numberField = binding.field
        binding.oneButton.setOnClickListener {
            numberField.append("1")
        }
        binding.twoButton.setOnClickListener {
            numberField.append("2")
        }
        binding.threeButton.setOnClickListener {
            numberField.append("3")
        }
        binding.fourButton.setOnClickListener {
            numberField.append("4")
        }
        binding.fiveButton.setOnClickListener {
            numberField.append("5")
        }
        binding.sixButton.setOnClickListener {
            numberField.append("6")
        }
        binding.sevenButton.setOnClickListener {
            numberField.append("7")
        }
        binding.eightButton.setOnClickListener {
            numberField.append("8")
        }
        binding.nineButton.setOnClickListener {
            numberField.append("9")
        }

    }
}