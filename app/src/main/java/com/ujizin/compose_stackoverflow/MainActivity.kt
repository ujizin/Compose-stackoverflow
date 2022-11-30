package com.ujizin.compose_stackoverflow

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.imePadding
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.core.view.WindowCompat
import com.ujizin.compose_stackoverflow.ui.theme.ComposeStackoverflowTheme
import com.ujizin.compose_stackoverflow.ui.ui.keyboard_state.KeyboardStateScreen

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        WindowCompat.setDecorFitsSystemWindows(window, false)
        setContent {
            ComposeStackoverflowTheme {
                Surface(Modifier.statusBarsPadding()) {
                    KeyboardStateScreen()
                }
            }
        }
    }
}
