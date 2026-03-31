package np.com.dipeshlimbu.viewmodel

import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.State
import androidx.lifecycle.ViewModel
import np.com.dipeshlimbu.model.AuthenticationRepository

class LoginViewModel(
    private val repository: AuthenticationRepository
) : ViewModel() {

    private val _isLoginSuccessful = mutableStateOf(false)
    val isLoginSuccessful: State<Boolean> = _isLoginSuccessful

    private val _errorMessage = mutableStateOf("")
    val errorMessage: State<String> = _errorMessage

    fun login(username: String, password: String) {
        if (repository.login(username, password)) {
            _isLoginSuccessful.value = true
            _errorMessage.value = ""
        } else {
            _isLoginSuccessful.value = false
            _errorMessage.value = "Invalid username or password"
        }
    }
}