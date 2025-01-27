package com.example.whenigo.ui.main

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

// main screen showing to do list

@Composable
fun ToDoListScreen() {
    Column(modifier = Modifier.padding(16.dp)) {
        Text(text = "Your To-Do List", style = MaterialTheme.typography.headlineMedium)

        // Task Items
        TaskItem(taskName = "Buy Milk")
        TaskItem(taskName = "Pick up Laundry")
    }

}