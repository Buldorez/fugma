package com.example.figma.DataBase

data class quotes(val sucess: Boolean, val data: ArrayList<data_quotes>)
data class data_quotes(val id: Int,val title: String, val image:String, val description:String)
