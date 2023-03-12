package com.example.foodapp.features.fetch_menu_items.data.remote

import com.example.foodapp.features.fetch_menu_items.data.remote.menu_data_dto.MenuData
import com.example.foodapp.features.fetch_menu_items.data.remote.venue_info_dto.VenueInfo
import retrofit2.http.GET

interface StoveApi {
    @GET("v4/menu/getMenu/?venueid=1")
    suspend fun getMenuData():MenuData

    @GET("v4/venue/getVenueInfo")
    suspend fun getVenueInfo(): VenueInfo
}


//const baseURL = "https://external.stovepos.com/sys/";
//?venueid=9

//https://pos.stovestack.com/sys/v4/menu/getMenu?venueid=1&timezone=America/Los_Angeles