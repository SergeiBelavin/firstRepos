package com.example.stars

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.stars.databinding.TestRcviewBinding

class TestAdapter: RecyclerView.Adapter<TestAdapter.TestHolder>() {
    val nameList = ArrayList<TestRcView>()

    class TestHolder(item: View): RecyclerView.ViewHolder(item) {
        val binding = TestRcviewBinding.bind(item)
        fun bind(testRcView: TestRcView) {
            binding.name.text = testRcView.name
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TestHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.test_rcview, parent, false)
        return TestHolder(view)
    }

    override fun onBindViewHolder(holder: TestHolder, position: Int) {
        holder.bind(nameList[position])
    }

    override fun getItemCount(): Int {
        return nameList.size
    }
    fun addTest(test: TestRcView){
        nameList.add(test)
        notifyDataSetChanged()
    }
}