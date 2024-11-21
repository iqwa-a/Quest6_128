package com.example.quest6_128.ui.view.screen

import androidx.compose.material3.SnackbarHostState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.setValue

@Composable
fun RencanaStudyView(
    mahasiswa: Mahasiswa,
    onSubmitButtonCliked: (MutableList<String>) -> Unit,
    onBackButtonCliked: () -> Unit
) {

    var chosenDropdown by remember { mutableStateOf("") }
    var pilihanKelas by remember { mutableStateOf("") }
    var checked by remember { mutableStateOf(false) }

    val listData = mutableListOf(chosenDropdown, pilihanKelas)


    val snackbarHostState = remember { SnackbarHostState() }

    val coroutineScope = rememberCoroutineScope()
