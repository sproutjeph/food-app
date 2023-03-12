package com.example.foodapp.features.fetch_menu_items.data.remote.menu_data_dto

data class Ingredient(
    val name: String,
    val qty: String,
    val sku: String,
    val sortOrder: Int,
    val unit: String
)