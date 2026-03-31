package np.com.dipeshlimbu

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun ProfileScreen(modifier: Modifier = Modifier) {
    Column(modifier.fillMaxSize(), horizontalAlignment = Alignment.CenterHorizontally) {
        Spacer(Modifier.height(40.dp))
        Box(Modifier.size(100.dp).background(Color.LightGray, CircleShape), Alignment.Center) {
            Icon(Icons.Default.Person, null, modifier = Modifier.size(60.dp))
        }
        Text("Alex Johnson", style = MaterialTheme.typography.headlineSmall)
        Text("alex.johnson@example.com", color = Color.Gray)
    }
}