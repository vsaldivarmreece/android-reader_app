package com.vsaldivarm.readerapp.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.vsaldivarm.readerapp.screens.ReaderSplashScreen
import com.vsaldivarm.readerapp.screens.home.Home
import com.vsaldivarm.readerapp.screens.login.ReaderLoginScreen

@Composable
fun ReaderNavigation() {
    val  navController = rememberNavController()
    NavHost(navController = navController,
        startDestination = ReaderScreens.SplashScreen.name){
        composable(ReaderScreens.SplashScreen.name) {
            ReaderSplashScreen(navController = navController)
        }
        composable(ReaderScreens.LogInScreen.name) {
            ReaderLoginScreen(navController = navController)
        }
        composable(ReaderScreens.HomeScreen.name) {
            Home(navController = navController)
        }

    }
}