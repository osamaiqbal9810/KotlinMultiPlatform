package com.ps19.kotlinbaseline.LoginModule

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import com.ps19.kotlinbaseline.HomeScreen

@Composable
fun ForgotPasswordScreen(navHostController: NavHostController) {
    Column (
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = "Forgot Password Page")

        Button(onClick = { navHostController.navigate(HomeScreen.Login.route) }) {
            Text("Go to login Screen")
        }
    }
}