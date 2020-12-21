package Database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import Database.Customer
import Database.Tanaman

@Database(entities = arrayOf(Customer::class, Tanaman::class), version = 1)
abstract class AppCustomerRoomDB :RoomDatabase() {

    abstract fun CustomerDao(): CustomerDao
    abstract fun TanamanDao(): TanamanDao

    companion object {

        @Volatile
        private var INSTANCE: AppCustomerRoomDB? = null
        private val LOCK = Any()

        operator fun invoke(context: Context) = INSTANCE ?: synchronized(LOCK){
            INSTANCE ?: buildDatabase(context).also {
                INSTANCE = it
            }
        }

        private fun buildDatabase(context: Context) = Room.databaseBuilder(
            context.applicationContext,
            AppCustomerRoomDB::class.java,
            "APPDB"
        ).build()

        }
    }
