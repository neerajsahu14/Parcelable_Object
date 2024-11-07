package com.example.parcelableobject

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
class Person(
    val firstNane: String,
    val lastName: String,
) : Parcelable