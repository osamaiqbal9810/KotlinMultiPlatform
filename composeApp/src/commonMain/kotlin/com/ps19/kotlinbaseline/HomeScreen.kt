package com.ps19.kotlinbaseline

import LoginScreen
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.ps19.kotlinbaseline.LoginModule.ForgotPasswordScreen
import com.ps19.kotlinbaseline.LoginModule.SignUpScreen

sealed class HomeScreen(var route: String) {
    data object Login: HomeScreen("login")
    data object  SignUp: HomeScreen("signup")
    data object ForgotPassword: HomeScreen("forgotpassword")
}

@Composable
fun HomeScreen(navHostController: NavHostController) {
    NavHost(navHostController, startDestination = HomeScreen.Login.route) {
        composable(HomeScreen.Login.route) {
            LoginScreen(navHostController)
        }

        composable(HomeScreen.SignUp.route) {
            SignUpScreen(navHostController)
        }

        composable(HomeScreen.ForgotPassword.route) {
            ForgotPasswordScreen(navHostController)
        }
    }
}
