package np.com.dipeshlimbu

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.getValue
import androidx.lifecycle.viewmodel.compose.viewModel

import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

import np.com.dipeshlimbu.model.AuthenticationRepository
import np.com.dipeshlimbu.ui.DashboardScreen
import np.com.dipeshlimbu.ui.LoginScreen
import np.com.dipeshlimbu.viewmodel.LoginViewModel
import np.com.dipeshlimbu.viewmodel.LoginViewModelFactory

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {

            val navController = rememberNavController()

            val loginViewModel: LoginViewModel = viewModel(
                factory = LoginViewModelFactory(AuthenticationRepository())
            )

            val errorMessage by loginViewModel.errorMessage

            NavHost(
                navController = navController,
                startDestination = "login"
            ) {

                composable("login") {
                    LoginScreen(
                        onLogin = { username: String, password: String ->
                            loginViewModel.login(username, password)

                            if (loginViewModel.isLoginSuccessful.value) {
                                navController.navigate("dashboard")
                            }
                        },
                        errorMessage = errorMessage
                    )
                }

                composable("dashboard") {
                    DashboardScreen()
                }
            }
        }
    }
}