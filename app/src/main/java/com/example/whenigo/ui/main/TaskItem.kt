package com.example.whenigo.ui.main

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.material3.Text
import androidx.compose.foundation.layout.Row
import androidx.compose.ui.tooling.preview.Preview


// composable for individual to-do items

@Composable
fun TaskItem(taskName: String){
    Card(modifier = Modifier
        .padding(bottom = 8.dp)
        .fillMaxWidth()
    ) {
        Row(modifier = Modifier.padding(16.dp)) {
            Text(text = taskName)
        }
    }
}


@Preview
@Composable
fun TaskItemPreview() {
    TaskItem(taskName = "Sample Task")
}