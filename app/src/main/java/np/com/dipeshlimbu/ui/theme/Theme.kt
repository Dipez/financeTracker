// src/main/java/np/com/dipeshlimbu/ui/theme/Theme.kt
package np.com.dipeshlimbu.ui.theme

import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.ui.graphics.Color
import androidx.compose.foundation.shape.RoundedCornerShape

// Define your color palettes
private val DarkColorPalette = darkColorScheme(
    primary = Color(0xFF1EB980),
    secondary = Color(0xFF03DAC6)
)

private val LightColorPalette = lightColorScheme(
    primary = Color(0xFF1EB980),
    secondary = Color(0xFF03DAC6)
)

// Define custom shapes with `RoundedCornerShape` (now of type `CornerBasedShape`)
private val Shapes = Shapes(
    small = RoundedCornerShape(4.dp),
    medium = RoundedCornerShape(8.dp),
    large = RoundedCornerShape(16.dp)
)

@Composable
fun Theme(
    content: @Composable () -> Unit
) {
    val colorScheme = if (isSystemInDarkTheme()) DarkColorPalette else LightColorPalette

    MaterialTheme(
        colorScheme = colorScheme,
        typography = Typography,
        shapes = Shapes, // Corrected shape definition
        content = content
    )
}