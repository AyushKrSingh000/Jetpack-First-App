package com.example.myfirstcomposeapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.myfirstcomposeapp.ui.theme.MyFirstComposeAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyFirstComposeAppTheme {
                // A surface container using the 'background' color from the theme

                MyApp()
            }
        }
    }
}
@Composable
fun MyApp(){
    Column(horizontalAlignment = Alignment.CenterHorizontally, verticalArrangement = Arrangement.Center, modifier = Modifier.padding(50.dp)){
        data("Hello My Name is Ayush Kumar Singh")
        data("This is my first jetpack compose app")
        
    }
}
@Composable
fun data(text : String){
    Text(text = "$text",textAlign= TextAlign.Start, modifier = Modifier.padding(5.dp),color=Color.Magenta)

}



@Preview(showBackground = false , name = "Ayush Kumar Singh")
@Composable
fun DefaultPreview() {
    MyFirstComposeAppTheme {
       MyApp()
    }
}