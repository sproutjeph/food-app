package com.example.foodapp.features.fetch_menu_items.data.remote.menu_data_dto

data class IngredientsJson(
    val featured_images: List<String>,
    val ingredients: List<Ingredient>,
    val instructions: List<Instruction>,
    val plating: List<Plating>,
    val prep_instructions: List<PrepInstruction>
)