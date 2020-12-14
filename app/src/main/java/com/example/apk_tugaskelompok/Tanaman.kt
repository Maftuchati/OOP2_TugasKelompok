package com.example.apk_tugaskelompok

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "tanaman")
data class Tanaman(
    @PrimaryKey val kode: Int,
    @ColumnInfo(name = "namatanaman") val namatanaman: String?,
    @ColumnInfo(name = "stock") val stock: String?
)