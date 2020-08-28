package io.github.rsookram.compose.example

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.compose.foundation.Box
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.size
import androidx.compose.material.MaterialTheme
import androidx.compose.material.darkColors
import androidx.compose.material.lightColors
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.setContent
import androidx.compose.ui.unit.dp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        Log.d("MainActivity", "onCreate called for $this")

        setContent {
            // The theme doesn't seem to update on compose 1.0.0-alpha01 when
            // toggling dark mode...
            MaterialTheme(colors = if (isSystemInDarkTheme()) darkColors() else lightColors()) {
                Box(Modifier.size(48.dp), backgroundColor = MaterialTheme.colors.onBackground)
            }
        }
    }
}
