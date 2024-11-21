package com.example.quest6_128.ui.view.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Scaffold
import androidx.compose.material3.SnackbarHost
import androidx.compose.material3.SnackbarHostState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.quest6_128.model.Mahasiswa

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

    Scaffold(
        snackbarHost = { SnackbarHost(hostState = snackbarHostState) }
    ) { paddingValues ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .background(color = colorResource(id = R.color.primary))
                .padding(paddingValues)
        ){
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(16.dp), verticalAlignment = Alignment.CenterVertically
            ) {
                Image(
                    painter = painterResource(id = R.drawable.umy2),
                    contentDescription = "",
                    modifier = Modifier
                        .size(50.dp)
                )
                Spacer(modifier = Modifier.padding(start = 16.dp))
                Column(modifier = Modifier.weight(1f)) {
                    Text(
                        text = mahasiswa.Nim,
                        fontWeight = FontWeight.Bold,
                        fontSize = 20.sp,
                        color = Color.White
                    )
                    Text(
                        text = mahasiswa.Nama,
                        fontWeight = FontWeight.Light,
                        fontSize = 15.sp,
                        color = Color.White
                    )
                }



