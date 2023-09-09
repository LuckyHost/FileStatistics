package com.example.filestatistics.domian.Room.DataClass

data class Embedded(
    val items: List<Item>,
    val limit: Int,
    val offset: Int,
    val path: String,
    val sort: String,
    val total: Int
)