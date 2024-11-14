import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color

import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.unit.dp
import androidx.compose.ui.text.style.TextAlign

import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import com.ps19.kotlinbaseline.HomeScreen
import com.ps19.kotlinbaseline.LoginModule.LoginService
import kotlinbaseline.composeapp.generated.resources.Res
import kotlinbaseline.composeapp.generated.resources.google
import org.jetbrains.compose.resources.painterResource

import org.jetbrains.compose.ui.tooling.preview.Preview

@Composable
fun LoginScreen(
//    onLoginClick: (String, String) -> Unit,
//    onForgotPasswordClick: () -> Unit,
//    onSignUpClick: () -> Unit
navHostController: NavHostController
) {
    var email by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "Login",
            style = MaterialTheme.typography.h1,
            textAlign = TextAlign.Center,
            modifier = Modifier.fillMaxWidth()
        )

        Spacer(modifier = Modifier.height(24.dp))

        // Email Input
        OutlinedTextField(
            value = email,
            onValueChange = { email = it },
            label = { Text("Email") },
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Email),
            modifier = Modifier.fillMaxWidth()
        )

        Spacer(modifier = Modifier.height(16.dp))

        // Password Input
        OutlinedTextField(
            value = password,
            onValueChange = { password = it },
            label = { Text("Password") },
            visualTransformation = PasswordVisualTransformation(),
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
            modifier = Modifier.fillMaxWidth()
        )

        Spacer(modifier = Modifier.height(16.dp))

        // Login Button
        Button(
            onClick = { LoginService().onLoginClick(email, password, navHostController) },
            modifier = Modifier.fillMaxWidth()
        ) {
            Text(text = "Login")
        }

        Spacer(modifier = Modifier.height(8.dp))

//        // Forgot Password Text
        TextButton(onClick = {navHostController.navigate(HomeScreen.ForgotPassword.route)} ) {
            Text(text = "Forgot Password?")
        }

        Spacer(modifier = Modifier.height(8.dp))

//        // Sign Up Text
        TextButton(onClick = { navHostController.navigate(HomeScreen.SignUp.route) }) {
            Text(text = "Don't have an account? Sign Up")
        }

        Box(
            modifier = Modifier
                .padding(10.dp)
                .border(1.dp, color = Color.Gray)
        ) {
            TextButton({}) {
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Column {

                        Image(
                            painter = painterResource(Res.drawable.google),
                            contentDescription = null,
                            modifier = Modifier.size(30.dp)
                        )
                    }
                    Column {
                        Text(
                            text = "Sign in with Google",
                            modifier = Modifier.padding(horizontal = 25.dp),
                            style = TextStyle(
                                fontWeight = FontWeight.Normal,
                                fontSize = 20.sp,
                                textAlign = TextAlign.Center
                            )
                        )
                    }
                }
            }
        }
    }
}

//@Preview()
//@Composable
//fun LoginScreenPreview() {
//    LoginScreen(
//        onLoginClick = { _, _ -> /* Handle login */ },
//        onForgotPasswordClick = { /* Handle forgot password */ },
//        onSignUpClick = { /* Handle sign up */ }
//    )
//}