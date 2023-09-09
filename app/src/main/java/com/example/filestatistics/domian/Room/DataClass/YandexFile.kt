package com.example.filestatistics.domian.Room.DataClass

data class YandexFile(
    val _embedded: Embedded,
    val comment_ids: CommentIdsX,
    val created: String,
    val exif: ExifX,
    val modified: String,
    val name: String,
    val path: String,
    val resource_id: String,
    val revision: Long,
    val type: String
)