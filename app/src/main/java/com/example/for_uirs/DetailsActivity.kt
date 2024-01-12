package com.example.for_uirs

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.for_uirs.databinding.ActivityDetailsBinding
import com.example.for_uirs.databinding.HomeWorksItemsBinding

class DetailsActivity : AppCompatActivity() {
    private lateinit var binding: ActivityDetailsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityDetailsBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val workImage = intent.getIntExtra("workImage", 0)
        val workName = intent.getStringExtra("workName")

        binding.workDWorkImage.setImageResource(workImage)
        binding.workDWorkName.text = workName

        binding.backHome.setOnClickListener {
            finish()
        }
    }
}