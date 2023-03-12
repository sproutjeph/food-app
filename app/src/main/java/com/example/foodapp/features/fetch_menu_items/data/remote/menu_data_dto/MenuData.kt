package com.example.foodapp.features.fetch_menu_items.data.remote.menu_data_dto

data class MenuData(
    val menuAltMods: List<MenuAltMod>,
    val menuCat: List<MenuCat>,
    val menuClass: List<Any>,
    val menuItems: List<MenuItem>,
    val message: String,
    val order_types: List<OrderType>,
    val result: Int,
    val sources: List<Source>,
    val table_section: List<TableSection>,
    val venuePromo: List<VenuePromo>
)