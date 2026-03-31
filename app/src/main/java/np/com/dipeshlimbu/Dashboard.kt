// file: DashboardScreen.kt
package np.com.dipeshlimbu.ui

import androidx.compose.foundation.layout.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import np.com.dipeshlimbu.GoalsScreen
import np.com.dipeshlimbu.HomeScreen
import np.com.dipeshlimbu.ProfileScreen
import np.com.dipeshlimbu.WalletScreen

val PrimaryGreen = Color(0xFF1B5E4F)
val LightBg = Color(0xFFF8F9FA)
val AccentRed = Color(0xFFE57373)
val AccentGreen = Color(0xFF81C784)

@Composable
fun DashboardScreen() {
    var currentScreen by remember { mutableStateOf("home") }

    Surface(color = LightBg) {
        Scaffold(
            bottomBar = {
                NavigationBar(containerColor = Color.White) {
                    NavigationBarItem(
                        selected = currentScreen == "home",
                        onClick = { currentScreen = "home" },
                        icon = { Icon(Icons.Default.Home, null) },
                        label = { Text("Home") }
                    )
                    NavigationBarItem(
                        selected = currentScreen == "wallet",
                        onClick = { currentScreen = "wallet" },
                        icon = { Icon(Icons.Default.List, null) },
                        label = { Text("Wallet") }
                    )
                    NavigationBarItem(
                        selected = currentScreen == "goals",
                        onClick = { currentScreen = "goals" },
                        icon = { Icon(Icons.Default.Star, null) },
                        label = { Text("Goals") }
                    )
                    NavigationBarItem(
                        selected = currentScreen == "profile",
                        onClick = { currentScreen = "profile" },
                        icon = { Icon(Icons.Default.Person, null) },
                        label = { Text("Profile") }
                    )
                }
            }
        ) { innerPadding ->
            val modifier = Modifier.padding(innerPadding)
            when (currentScreen) {
                "home" -> HomeScreen(modifier)
                "wallet" -> WalletScreen(modifier)
                "goals" -> GoalsScreen(modifier)
                "profile" -> ProfileScreen(modifier)
            }
        }
    }
}