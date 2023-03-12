package com.example.foodapp.features.fetch_menu_items.presentation.menu_data

import com.example.foodapp.features.fetch_menu_items.data.remote.menu_data_dto.MenuData

data class MenuDataState(
    val isLoading: Boolean = false,
    val menuData: MenuData? = null,
    val error: String = ""
)
