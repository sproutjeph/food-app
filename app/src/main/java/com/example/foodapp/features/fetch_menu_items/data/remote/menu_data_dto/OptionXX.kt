package com.example.foodapp.features.fetch_menu_items.data.remote.menu_data_dto

data class OptionXX(
    val description: String,
    val displayOrder: Int,
    val id: String,
    val name: String,
    val price: Int,
    val priceCurrency: String,
    val sku: String
)