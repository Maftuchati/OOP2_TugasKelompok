package com.example.apk_tugaskelompok

import androidx.room.Database
import android.content.Context
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(entities = arrayOf(Customer::class, Tanaman::class), version = 1)
abstract class AppCustomerRoomDatabase : RoomDatabase() {
    abstract fun CustomerDao(): CustomerDao
    abstract fun TanamanDao(): TanamanDao

    companion object {

        @Volatile
        private var INSTANCE: AppCustomerRoomDatabase? = null
        private val LOCK = Any()

        operator fun invoke(context: Context) = INSTANCE ?: synchronized(LOCK){
            INSTANCE ?: buildDatabase(context).also {
                INSTANCE = it
            }
        }

        private fun buildDatabase(context: Context) = Room.databaseBuilder(
            context.applicationContext,
            AppCustomerRoomDatabase::class.java,
            "APPDB"
        ).build()

    }
}
