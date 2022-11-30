package com.ujizin.compose_stackoverflow

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.material.Surface
import androidx.compose.ui.Modifier
import androidx.core.view.WindowCompat
import com.ujizin.compose_stackoverflow.ui.theme.ComposeStackoverflowTheme
import com.ujizin.compose_stackoverflow.presentation.keyboard_state.KeyboardStateScreen

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
