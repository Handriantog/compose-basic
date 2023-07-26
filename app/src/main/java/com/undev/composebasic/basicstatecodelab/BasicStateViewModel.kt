package com.undev.composebasic.basicstatecodelab

import androidx.compose.runtime.toMutableStateList
import androidx.lifecycle.ViewModel
import com.undev.composebasic.basicstatecodelab.model.WellnessTask

class BasicStateViewModel : ViewModel(){

    private val _tasks = getWellnessTask().toMutableStateList()
    val tasks: List<WellnessTask>
        get() = _tasks

    private fun getWellnessTask() = List(30) { i -> WellnessTask(i, "Task #$i") }

    fun remove(item: WellnessTask) {
        _tasks.remove(item)
    }

    fun changeTaskChecked(item: WellnessTask, checked: Boolean) {
        _tasks.find { it.id == item.id }?.let { task ->
            task.checked = checked
        }
    }

}