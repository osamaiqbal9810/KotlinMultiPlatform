package com.ps19.kotlinbaseline.LoginModule

import androidx.navigation.NavHostController
import com.ps19.kotlinbaseline.HomeScreen
import kotlinbaseline.composeapp.generated.resources.Res

class LoginService {
    fun onLoginClick(email: String, password: String, navHostController: NavHostController) {
        println(email+" Hello"+ password)
        navHostController.navigate(HomeScreen.SignUp.route)

    }
}