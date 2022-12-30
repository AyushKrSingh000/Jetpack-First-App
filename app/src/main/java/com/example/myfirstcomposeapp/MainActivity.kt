package com.example.myfirstcomposeapp

import android.content.Context
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.myfirstcomposeapp.login.LoginScreen
import com.example.myfirstcomposeapp.ui.theme.MyFirstComposeAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {

            MyFirstComposeAppTheme {
                MyApp(value= this)
            }
        }
    }
}


@Composable
fun MyApp(value : MainActivity){
    Surface(color = MaterialTheme.colors.background){
        LoginScreen(value =value)
    }

        
}




@Preview(showBackground = false , name = "Ayush Kumar Singh")
@Composable
fun DefaultPreview() {
    MyFirstComposeAppTheme {
       MyApp(value = MainActivity())
    }
}