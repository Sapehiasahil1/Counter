package com.example.counter

import androidx.activity.viewModels
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.heightIn
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Alignment.Companion.CenterVertically
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun MainUI(viewModels: CounterViewModel) {

    var text = viewModels.count

    Column(
        modifier = Modifier
            .fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {

        Text(
            "$text",
            modifier = Modifier
                .align(Alignment.CenterHorizontally)
                .height(24.dp),
            color = Color.Black,
        )
        Spacer(modifier = Modifier.height(16.dp))
        Button(
            onClick = {
                viewModels.increment()
            },
            modifier = Modifier
                .fillMaxWidth()
                .height(108.dp)
        ) {

            Text("+",
                modifier = Modifier
                    .align(CenterVertically)
                    .height(32.dp))
        }
        Spacer(modifier = Modifier.height(8.dp))
        Button(
            onClick = {
                viewModels.decrement()
            },
            modifier = Modifier
                .fillMaxWidth()
                .height(80.dp)
        ) {
            Text("-",
                modifier = Modifier
                    .align(CenterVertically)
                    .height(80.dp))
        }


    }
}

