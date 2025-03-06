package br.senai.sp.jandira.BMI.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun UserDataScreen (modifier: Modifier = Modifier) {
Box(
    modifier = Modifier
        .fillMaxSize()
        .background(
            brush = Brush.verticalGradient(
                listOf(
                    Color(0xFD00DAFF),
                    Color(0xFF0005F1)
                )
            )
        )
)
}
@Preview (showSystemUi = true)
@Composable
private fun UserDataScreenpreview() {
    UserDataScreen()
}