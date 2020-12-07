package com.example.apk_tugaskelompok

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "admin")
class Admin(
    @PrimaryKey val id: Int,
    @ColumnInfo(name = "admin_nama") val admin_nama: String?,
    @ColumnInfo(name = "admin_email")
    val email: String?
) {
}
