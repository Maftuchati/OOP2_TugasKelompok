package com.example.apk_tugaskelompok

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "users")
class User(
    @PrimaryKey val id: Int,
    @ColumnInfo(name = "user_nama") val user_nama: String?,
    @ColumnInfo(name = "user_email")
    val email: String?
) {
}
    