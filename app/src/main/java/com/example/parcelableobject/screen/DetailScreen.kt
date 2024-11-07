package com.example.parcelableobject.screen

import android.util.Log
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.text.font.FontWeight
import androidx.navigation.NavHostController
import com.example.parcelableobject.SharedViewModel

@Composable
fun DetailScreen(
    navController: NavHostController,
    sharedViewModel: SharedViewModel
){
    val person = sharedViewModel.person
    LaunchedEffect(key1 = person){
        if(person!=null) {
            Log.d("Person", person.firstNane)
            Log.d("Person", person.lastName)
        }
    }
    Box(
        modifier = Modifier.fillMaxSize()
            .clickable{
                navController.popBackStack()
            },
        contentAlignment = Alignment.Center,
    ){
        Text(
            text = (person?.firstNane + " " + person?.lastName) ?: "No Person",
            fontSize = MaterialTheme.typography.titleLarge.fontSize,
            fontWeight = FontWeight.Bold
        )

    }
}