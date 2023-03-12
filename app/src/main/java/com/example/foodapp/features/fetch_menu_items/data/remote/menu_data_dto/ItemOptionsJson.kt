package com.example.foodapp.features.fetch_menu_items.data.remote.menu_data_dto

data class ItemOptionsJson(
    val displayOrder: Int,
    val eligibleQuantityMax: Int,
    val eligibleQuantityMin: Int,
    val id: String,
    val name: String,
    val optionType: Int,
    val options: List<Option>,
    val required: Int,
    val sku: String
)