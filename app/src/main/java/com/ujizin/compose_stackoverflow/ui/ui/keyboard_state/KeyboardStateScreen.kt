package com.ujizin.compose_stackoverflow.ui.ui.keyboard_state

import android.widget.Toast
import androidx.compose.foundation.layout.ExperimentalLayoutApi
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.ime
import androidx.compose.material.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.State
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.rememberUpdatedState
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.platform.LocalLifecycleOwner
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.LifecycleOwner

/** you can use enum instead boolean. */
@Composable
fun keyboardAsState(): State<Boolean> {
    val isImeVisible = WindowInsets.ime.getBottom(LocalDensity.current) > 0
    return rememberUpdatedState(isImeVisible)
}

@Composable
fun KeyboardStateScreen() {
    val keyboardState by keyboardAsState()
    val context = LocalContext.current
    var value by rememberSaveable { mutableStateOf("") }

    TextField(value, onValueChange = { value = it })

    LaunchedEffect(keyboardState) {
        Toast.makeText(context, "Result: $keyboardState", Toast.LENGTH_SHORT).show()
    }
}