package br.applabbs.demokmp

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.Settings
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import org.jetbrains.compose.resources.ExperimentalResourceApi


@OptIn(ExperimentalResourceApi::class)
@Composable
fun App(){

    //val contextForToast = LocalContext.current.applicationContext

    Scaffold(
        topBar = {
            TopAppBar (
                backgroundColor = Color.Gray,
                contentColor = Color.White,
                title = {
                    Text(text = "Overview", fontSize = 18.sp, fontWeight = FontWeight.Bold, fontFamily = FontFamily.Monospace)
                },
                elevation = 4.dp,
                navigationIcon = {
                    IconButton(
                        onClick = { print("exit") }
                    ){
                        Icon(
                            imageVector = Icons.Filled.ArrowBack, contentDescription = "End App"
                        )
                    }
                },
                actions = {
                    IconButton(
                        onClick = { }
                    ){
                        Icon(imageVector = Icons.Filled.Search, contentDescription = "Search")
                    }

                    IconButton(
                        onClick = { }
                    ){
                        Icon(imageVector = Icons.Filled.Settings, contentDescription = "Settings")
                    }
                }
            )
        },
        bottomBar = { }
    ){
//        Column(
//            modifier = Modifier.fillMaxSize().background(Color.White)
//        ) {
//            Text(text = "text 1")
//            Text(text = "text 1")
//            Text(text = "text 1")
//        }
    }

}

