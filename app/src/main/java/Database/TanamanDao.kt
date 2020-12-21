package Database

import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update

interface TanamanDao {
    @Insert
    suspend fun addTanaman(tanaman: Tanaman)

    @Update
    suspend fun updateTanaman(tanaman: Tanaman)

    @Delete
    suspend fun deleteTanaman(tanaman: Tanaman)

    @Query("SELECT * FROM tanaman")
    suspend fun getAllUser(): List<Tanaman>
}