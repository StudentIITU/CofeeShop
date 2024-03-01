package com.damir.cofeeshop.main

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import com.damir.cofeeshop.R
import com.damir.cofeeshop.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var  binding: ActivityMainBinding
    private lateinit var taskViewModel: TaskViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        taskViewModel = ViewModelProvider(this).get(TaskViewModel::class.java)
        binding.newTaskButton.setOnClickListener {
            NewTaskSheet().show(supportFragmentManager, "NewTag")

        }
        taskViewModel.name.observe(this) {
            binding.taskName.text = String.format("Task Name :%s", it)
        }
        taskViewModel.desc.obserce(this) {
            binding.taskDesc.text = String.format("Task Desc: %s", it)
        }
    }
}