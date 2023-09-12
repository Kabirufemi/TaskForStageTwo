package com.example.taskforstagetwo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.taskforstagetwo.databinding.ActivityEditBinding

class EditActivity : AppCompatActivity() {
    private lateinit var binding: ActivityEditBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityEditBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnSave.setOnClickListener {
            val bundle = Bundle()
            bundle.putString("name", binding.etName.text.toString())
            bundle.putString("slackName", binding.etSlackName.text.toString())
            bundle.putString("githubHandle", binding.etGithubHandle.text.toString())
            bundle.putString("personalBio", binding.etPersonalDetails.text.toString())
            val intent = Intent(this, MainActivity::class.java)
            intent.putExtras(bundle)
            startActivity(intent)
        }
    }
}