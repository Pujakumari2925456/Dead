package com.example.weatherapppractise.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.weatherapppractise.Screens.Splash.WeatherSplashScreen
import com.example.weatherapppractise.Screens.main.WeatherMainScreen

@Composable
fun WeatherNavigation() {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = WeatherScreens.SplashScreen.name){
        composable(WeatherScreens.SearchScreen.name){
        WeatherSplashScreen(navController=navController)
        }
        composable(WeatherScreens.MainScreen.name){
            WeatherMainScreen(navController = navController)
        }
    }
}