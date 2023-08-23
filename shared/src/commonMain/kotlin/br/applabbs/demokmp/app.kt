package br.applabbs.demokmp

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier

@Composable
fun App(){
    var count by remember {
        mutableStateOf(0)
    }

    Column(
        Modifier.fillMaxWidth()

    ){
        Button(
            onClick = {
                count++
            }
        ){
            Text("Count: $count")
        }
        Button(
            onClick = {
                count = 0
            }
        ){
            Text("Reset Counter")
        }
    }
}

