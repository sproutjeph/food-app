package com.example.foodapp.features.fetch_menu_items.data.remote.menu_data_dto

data class Option(
    val description: String,
    val displayOrder: Int,
    val eligibleQuantityMax: Int,
    val id: String,
    val name: String,
    val optionType: Int,
    val options: List<OptionX>,
    val price: Double,
    val priceCurrency: String,
    val required: Int,
    val sku: String
)