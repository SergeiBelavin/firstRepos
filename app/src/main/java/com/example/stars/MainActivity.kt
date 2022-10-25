package com.example.stars

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.stars.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    private val adapter = TestAdapter()
    private val nameList = listOf(
    "1",
    "2",
    "3",
    "4",
    "5"
    )
    private var index = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        init()
    }
    private fun init() = with(binding){
            rcView.layoutManager = GridLayoutManager(this@MainActivity,1)
            rcView.adapter = adapter
            findName.setOnClickListener {
                if(index > 4) index = 0
                val test = TestRcView(nameList[index])
            adapter.addTest(test)
                index++
            }

    }
}