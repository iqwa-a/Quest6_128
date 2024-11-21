package com.example.quest6_128.navigation

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.rememberNavController
import com.example.quest6_128.model.Mahasiswa

enum class Halaman {
    MahasiswaForm,
    RencanaStudy,
    Splash,
    Tampil,
}
@Composable
fun PengelolaanHalaman(
    modifier: Modifier = Modifier,
    navHost: NavHostController = rememberNavController()
) {
    val mahasiswa = remember {
        mutableStateOf(
            Mahasiswa(
                Nama = "",
                Nim = "",
                Email = "",
                Matakuliah = "",
                Kelas = ""
            )
        )
    }

    NavHost(
        modifier = modifier.fillMaxSize(),
        navController = navHost,
        startDestination = Halaman.Splash.name
    )