package com.example.foodapp.features.fetch_menu_items.domain

import com.example.foodapp.features.fetch_menu_items.data.remote.menu_data_dto.MenuData
import com.example.foodapp.features.fetch_menu_items.data.remote.venue_info_dto.VenueInfo

interface MenuDataRepository {
    suspend fun getMenuData(): MenuData
    suspend fun getVenueInfo(): VenueInfo
}