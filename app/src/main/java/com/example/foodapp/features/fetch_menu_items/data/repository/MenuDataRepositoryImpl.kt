package com.example.foodapp.features.fetch_menu_items.data.repository

import com.example.foodapp.features.fetch_menu_items.data.remote.StoveApi
import com.example.foodapp.features.fetch_menu_items.data.remote.menu_data_dto.MenuData
import com.example.foodapp.features.fetch_menu_items.data.remote.venue_info_dto.VenueInfo
import com.example.foodapp.features.fetch_menu_items.domain.MenuDataRepository
import javax.inject.Inject

class MenuDataRepositoryImpl @Inject constructor (
    private val api: StoveApi
        ): MenuDataRepository {
    override suspend fun getMenuData(): MenuData {
        return api.getMenuData()
    }

    override suspend fun getVenueInfo(): VenueInfo {
        return api.getVenueInfo()
    }
}