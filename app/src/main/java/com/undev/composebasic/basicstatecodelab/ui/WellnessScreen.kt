package com.undev.composebasic.basicstatecodelab.ui

import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.lifecycle.viewmodel.compose.viewModel
import com.undev.composebasic.basicstatecodelab.BasicStateViewModel

@Composable
fun WellnessScreen(
    modifier: Modifier = Modifier,
    viewModel: BasicStateViewModel = viewModel()
) {
    Column(modifier = modifier) {
        WaterCounter(modifier)

        WellnessTaskList(
            taskList = viewModel.tasks,
            onCheckedTask = { task, checked ->
                viewModel.changeTaskChecked(task, checked)
            },
            onCloseTask = { task -> viewModel.remove(task) }
        )
    }

}

