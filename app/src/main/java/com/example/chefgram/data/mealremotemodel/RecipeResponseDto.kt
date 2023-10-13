package com.example.chefgram.data.mealremotemodel

data class RecipeResponseDto(
    val cookingMinutes: Int,
    val cuisines: List<Any>,
    val dairyFree: Boolean,
    val diets: List<String>,
    val dishTypes: List<String>,
    val extendedIngredients: List<ExtendedIngredient>,
    val glutenFree: Boolean,
    val id: Int,
    val image: String,
    val instructions: String,
    val occasions: List<String>,
    val preparationMinutes: Int,
    val readyInMinutes: Int,
    val servings: Int,
    val sourceName: String,
    val summary: String,
    val sustainable: Boolean,
    val title: String,
    val vegan: Boolean,
    val vegetarian: Boolean,
    val veryHealthy: Boolean,
)