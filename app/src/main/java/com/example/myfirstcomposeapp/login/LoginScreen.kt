package com.example.myfirstcomposeapp.login




import android.widget.Toast
import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Info
import androidx.compose.material.icons.filled.Person
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember

import androidx.compose.ui.unit.sp

import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight

import androidx.compose.ui.unit.dp
import com.example.myfirstcomposeapp.MainActivity
import com.example.myfirstcomposeapp.ui.theme.Purple500


fun auth(username:String, password : String,auth : MainActivity){
    if(username=="ayush" && password=="123456"){
        Toast.makeText( auth
            ,"Logged In",Toast.LENGTH_SHORT).show()

    }else{
        Toast.makeText( auth
            ,"Wrong email Or Password",Toast.LENGTH_SHORT).show()
    }
}

@Composable
fun LoginScreen(value : MainActivity) {
    val username = remember {
        mutableStateOf("")
    }
    val password = remember {
        mutableStateOf("")
    }
    Scaffold(content = {
        Column(verticalArrangement = Arrangement.Center, modifier = Modifier
            .fillMaxSize()
            .padding(40.dp)){
            Text(text="Hello Again",color = Purple500,fontSize = 25.sp, fontFamily = FontFamily.Monospace, fontWeight = FontWeight.Bold)
            Text(text="Welcome Back",color = Purple500,fontSize = 25.sp, fontFamily = FontFamily.Monospace, fontWeight = FontWeight.Bold)
            Text(text="Login Screen",color = Purple500,fontSize = 25.sp, fontFamily = FontFamily.Monospace, fontWeight = FontWeight.Bold)
            OutlinedTextField(value = username.value, onValueChange = {
                username.value=it

            }, leadingIcon = {
                Icon(Icons.Default.Person, contentDescription = "person")
            }, label = {
                Text(text = "Username")
            },
                placeholder = {
                    Text(text = "Enter Username")
                },modifier = Modifier.height(70.dp).fillMaxSize().padding(vertical =5.dp))
            OutlinedTextField(
                value = password.value,
                onValueChange = {
                    password.value = it

                },
                leadingIcon = {
                    Icon(Icons.Default.Info, contentDescription = "password")
                },
                label = {
                    Text(text = "Password")
                },
                placeholder = {
                    Text(text = "Enter Password")
                },
                modifier = Modifier.height(70.dp).fillMaxSize().padding(vertical =5.dp),
            )
            OutlinedButton(onClick = { auth(username=username.value,password=password.value, auth = value) },modifier = Modifier.height(80.dp).fillMaxSize().padding(vertical =10.dp)) {
                Text(text = "Login")
                
            }
            
        }

    })





}
