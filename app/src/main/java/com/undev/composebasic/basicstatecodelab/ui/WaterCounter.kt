package com.undev.composebasic.basicstatecodelab.ui

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun WaterCounter(modifier: Modifier = Modifier) {
    StatefulCounter(modifier = modifier)
}

@Composable
fun StatefulCounter(modifier: Modifier) {
    var count by remember { mutableStateOf(0) }
    StatelessCounter(
        count = count,
        onIncrement = { count++ },
        modifier = modifier
    )
}

@Composable
fun StatelessCounter(
    count: Int,
    onIncrement: () -> Unit,
    modifier: Modifier = Modifier
) {
    Column(modifier = modifier.padding(16.dp)) {
        if (count > 0) {
            Text("You've had $count glasses.")
        }
        Button(
            onClick = onIncrement,
            enabled = count < 10,
            modifier = Modifier.padding(top = 8.dp)
        ) {
            Text("Add one")
        }
    }
}


/*
@Composable
fun WaterCounter(modifier: Modifier = Modifier) {
    var count by remember { mutableStateOf(0) }
    Column(
        modifier = modifier.padding(16.dp)
    ) {
        if (count > 0) {
            var showTask by remember { mutableStateOf(true) }
            Text(text = "You've had $count glasses.")
            if (showTask) {
                WellnessTaskItem(taskName = "Have you taken 15 minute walk today?", onClose = { showTask = false })
            }
        }

        Row(
            modifier = Modifier.padding(top = 8.dp)
        ) {
            Button(
                onClick = { count += 1 },
                enabled = count < 10
            ) {
                Text(text = "Add one")
            }
            
            Button(
                onClick = { count = 0 },
                enabled = count > 0,
                modifier = Modifier.padding(start = 8.dp)
            ) {
                Text(text = "Clear Water Count")
            }
        }
    }
}*/
