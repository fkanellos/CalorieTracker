package com.example.tracker_presentation.tracker_overview

import androidx.annotation.DrawableRes
import com.example.core.R.drawable.ic_breakfast
import com.example.core.R.drawable.ic_dinner
import com.example.core.R.drawable.ic_lunch
import com.example.core.R.drawable.ic_snack
import com.example.core.R.string.breakfast
import com.example.core.R.string.dinner
import com.example.core.R.string.lunch
import com.example.core.R.string.snacks
import com.example.core.util.UiText
import com.example.tracker_domain.model.MealType


data class Meal(
    val name: UiText,
    @DrawableRes val drawableRes: Int,
    val mealType: MealType,
    val carbs: Int = 0,
    val protein: Int = 0,
    val fat: Int = 0,
    val calories: Int = 0,
    val isExpanded: Boolean = false
)

val defaultMeals = listOf(
    Meal(
        name = UiText.StringResource(breakfast),
        drawableRes = ic_breakfast,
        mealType = MealType.Breakfast
    ),
    Meal(
        name = UiText.StringResource(lunch),
        drawableRes = ic_lunch,
        mealType = MealType.Lunch
    ),
    Meal(
        name = UiText.StringResource(dinner),
        drawableRes = ic_dinner,
        mealType = MealType.Dinner
    ),
    Meal(
        name = UiText.StringResource(snacks),
        drawableRes = ic_snack,
        mealType = MealType.Snack
    ),
)
