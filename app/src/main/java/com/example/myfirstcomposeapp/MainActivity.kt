package com.example.myfirstcomposeapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.myfirstcomposeapp.counter.CounterApp
import com.example.myfirstcomposeapp.ui.theme.MyFirstComposeAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyFirstComposeAppTheme {
                MyApp()
            }
        }
    }
}
fun incrementCounter(){

}

@Composable
fun MyApp(){
    Surface(color = MaterialTheme.colors.background){
        CounterApp()
    }

        
}




@Preview(showBackground = false , name = "Ayush Kumar Singh")
@Composable
fun DefaultPreview() {
    MyFirstComposeAppTheme {
       MyApp()
    }
}