package np.com.dipeshlimbu.model

class AuthenticationRepository {

    fun login(username: String, password: String): Boolean {
        // Dummy login logic
        return username == "admin" && password == "1234"
    }
}