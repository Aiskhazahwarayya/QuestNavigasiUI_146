package com.example.praktikum5

import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import androidx.navigation.NavHost
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import java.lang.reflect.Modifier

enum class Navigasi {
    Formulirku,
    Detail
}
@Composable
fun DataApp(
    navController: NavHostController = rememberNavController(),
    modifier: Modifier
){}
