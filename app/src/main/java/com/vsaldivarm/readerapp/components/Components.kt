package com.vsaldivarm.readerapp.components

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color

@Composable
fun ReaderLogo(modifier: Modifier = Modifier) {
    Text(
        text = "Reader", style = MaterialTheme.typography.displayLarge,
        color = Color.Red.copy(alpha = 0.5f)
    )
}