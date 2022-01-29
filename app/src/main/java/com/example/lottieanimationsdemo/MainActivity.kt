package com.example.lottieanimationsdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.lottieanimationsdemo.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    var isCheckedDone = false
    var isSwitchOn = false
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val lottieCheckDone = binding.lottieCheckedDone
        lottieCheckDone.setOnClickListener {
            if (isCheckedDone) {
                lottieCheckDone.speed = -1f
                lottieCheckDone.playAnimation()
                isCheckedDone = false
            } else {
                lottieCheckDone.speed = 1f
                lottieCheckDone.playAnimation()
                isCheckedDone = true
            }
        }
        val lottieSwitchButton = binding.lottieSwitchButton
        lottieSwitchButton.speed = 3f
        lottieSwitchButton.setOnClickListener {
            if (isSwitchOn) {
                lottieSwitchButton.setMinAndMaxProgress(0.5f, 1.0f)
                lottieSwitchButton.playAnimation()
                isSwitchOn = false
            } else {
                lottieSwitchButton.setMinAndMaxProgress(0.0f, 0.5f)
                lottieSwitchButton.playAnimation()
                isSwitchOn = true
            }
        }
    }
}