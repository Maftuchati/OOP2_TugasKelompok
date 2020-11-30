package com.example.apk_tugaskelompok

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(entities = arrayOf(Tanaman::class), version = 1)
abstract class TanamanRoomDatabase : RoomDatabase() {
    abstract fun tanamanDao(): TanamanDao

    abstract val applicationContext: Context
    val db = Room.databaseBuilder(
        applicationContext,
        TanamanRoomDatabase::class.java, "DBCS"
    ).build()

}
