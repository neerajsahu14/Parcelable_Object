package com.example.parcelableobject

sealed class Screens(
    val route : String,
) {
    object Home : Screens("home")
    object Detail : Screens("details")
}