package np.com.dipeshlimbu

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun WalletScreen(modifier: Modifier = Modifier) {
    Column(modifier.fillMaxSize().padding(16.dp)) {
        Text("Transactions", style = MaterialTheme.typography.headlineMedium)
        LazyColumn {
            items(10) { index ->
                ListItem(
                    headlineContent = { Text("Transaction #$index") },
                    supportingContent = { Text("March ${index + 1}, 2026") },
                    trailingContent = { Text("-$${index * 5}.00", color = MaterialTheme.colorScheme.secondary) }
                )
                HorizontalDivider()
            }
        }
    }
}