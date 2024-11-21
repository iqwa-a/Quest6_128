package com.example.quest6_128.ui.view.screen

import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember

@Composable
fun MahasiswaFormView(
    onSubmitButtonCliked: (MutableList<String>) -> Unit,
    onBackButtonCliked: () -> Unit,
) {
    val nama = remember { mutableStateOf("") }
    val nim = remember { mutableStateOf("") }
    val email = remember { mutableStateOf("") }
