package com.damir.cofeeshop.main;

import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import com.

class TaskItemViewHolder (
    private val context: Context,
    private val binding: TaskItemCellBinding
): RecyclerView:.ViewHolder(binding.root)
        {
    fun bindingTaskItem(taskItem: TaskItem)
        {
            binding.name.text = taskItem.name
        }
}
