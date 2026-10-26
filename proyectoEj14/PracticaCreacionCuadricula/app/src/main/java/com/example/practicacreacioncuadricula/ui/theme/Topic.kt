package com.example.practicacreacioncuadricula.ui.theme
import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Topic (
    @StringRes val name:Int,
    val availbleCourses:Int,
    @DrawableRes val imageRes: Int
)

