package com.undev.composebasic.basicstatecodelab.ui

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.undev.composebasic.basicstatecodelab.model.WellnessTask

@Composable
fun WellnessTaskList(
    modifier: Modifier = Modifier,
    taskList: List<WellnessTask>,
    onCloseTask: (WellnessTask) -> Unit,
    onCheckedTask: (WellnessTask, Boolean) -> Unit
) {

    LazyColumn(
        modifier = modifier
    ) {
        items(taskList) { task ->
            WellnessTaskItem(
                taskName = task.label,
                modifier = modifier,
                onClose = { onCloseTask(task) },
                checked = task.checked,
                onCheckedChange = { checked -> onCheckedTask(task, checked) }
            )
        }
    }

}