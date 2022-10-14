package com.intrannp.customlistview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.intrannp.customlistview.databinding.ActivityMainBinding
import com.intrannp.customlistview.databinding.ActivityUserBinding

class UserActivity : AppCompatActivity() {

    private lateinit var binding : ActivityUserBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar?.hide();
        binding = ActivityUserBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val name = intent.getStringExtra("name")

        val imageId = intent.getIntExtra("imageId",R.drawable.a)

        binding.nameProfile.text = name

        binding.profileImage.setImageResource(imageId)


    }
}