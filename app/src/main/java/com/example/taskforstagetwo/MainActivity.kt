package com.example.taskforstagetwo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.taskforstagetwo.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val bundle = intent.extras
        if (bundle == null) {
            val name = binding.tvName
            val slackName = binding.tvStackName
            val githubHandle = binding.tvGithubHandle
            val personalBio = binding.tvBio

            name.text = "BELLO KABIRU FEMI"
            slackName.text = "BELLO KABIRU FEMI"
            githubHandle.text = "Kabirufemi"
            personalBio.text = "I am a Nigerian, an HND holder in Electrical Engineering, an Android App developer, currently in for internship at HNGx"
            } else{
            binding.tvName.text = bundle.getString("name")
            binding.tvStackName.text = bundle.getString("slackName")
            binding.tvGithubHandle.text = bundle.getString("githubHandle")
            binding.tvBio.text = bundle.getString("personalBio")
        }
        binding.btnEdit.setOnClickListener {
            val  intent = Intent(this, EditActivity::class.java)
            startActivity(intent)
        }
    }


}