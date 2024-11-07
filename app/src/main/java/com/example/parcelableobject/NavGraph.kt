package com.example.parcelableobject

import android.util.Log
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.parcelableobject.screen.DetailScreen
import com.example.parcelableobject.screen.HomeScreen
@Composable
fun SetNavGraph(
    navController: NavHostController,
    sharedViewModel: SharedViewModel = viewModel()
){
    NavHost(
        navController = navController,
        startDestination = Screens.Home.route
    ) {
        composable(route = Screens.Home.route) {
            HomeScreen(navController,sharedViewModel)
        }
        composable(route = Screens.Detail.route) {
//            LaunchedEffect(key1 = Unit) { // Trigger only once
//                val result = navController.previousBackStackEntry?.savedStateHandle?.get<Person>("person")
//                Log.d("CheckData", "SetNavGraph: ${result?.firstNane}")
//                Log.d("CheckData", "SetNavGraph: ${result?.lastName}")
//            }
            DetailScreen(navController,sharedViewModel)
        }
    }
}