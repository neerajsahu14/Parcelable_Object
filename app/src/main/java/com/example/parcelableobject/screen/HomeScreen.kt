package com.example.parcelableobject.screen

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.navigation.NavHostController
import com.example.parcelableobject.Person
import com.example.parcelableobject.Screens
import com.example.parcelableobject.SharedViewModel

@Composable
fun HomeScreen(
    navController: NavHostController,
    sharedViewModel: SharedViewModel
) {
    Box(
        modifier = Modifier.fillMaxSize()
            .clickable{
                val person = Person("John", "Dao")
                sharedViewModel.addPerson(person)
//                navController.currentBackStackEntry?.savedStateHandle?.set(
//                    key="person",
//                    value = person)
                navController.navigate(Screens.Detail.route)
            },
        contentAlignment = Alignment.Center
    ){
        Text(
            text = "Home",
            fontSize = MaterialTheme.typography.titleLarge.fontSize,
            fontWeight = FontWeight.Bold
        )
    }
}