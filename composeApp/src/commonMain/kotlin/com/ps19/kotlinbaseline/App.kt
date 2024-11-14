package com.ps19.kotlinbaseline

import LoginScreen
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.*
import androidx.navigation.NavHost
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.rememberNavController
import org.jetbrains.compose.ui.tooling.preview.Preview

@Composable
@Preview
fun App() {
    MaterialTheme {
        val navController = rememberNavController()
        HomeScreen(navController)
//        LoginScreen(
//            onLoginClick = { email, password -> LoginService().onLoginClick(email, password) },
//            onForgotPasswordClick = {  },
//            onSignUpClick = { /* Handle sign up */ }
//        )
    }
}