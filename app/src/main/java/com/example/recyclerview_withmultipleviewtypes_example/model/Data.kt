package com.example.recyclerview_withmultipleviewtypes_example.model


//To store the data to be displayed on the views, we need a data class

/*The viewType will tell which view we are using i.e. either item_view_1 or item_view_2 and
textData will store the data that will be displayed on the TextView.*/

data class Data(val viewType: Int, val textData: String)