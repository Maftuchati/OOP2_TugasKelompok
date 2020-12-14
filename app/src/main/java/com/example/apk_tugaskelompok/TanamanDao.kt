package com.example.apk_tugaskelompok

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query

@Dao
interface TanamanDao {
    @Query("SELECT * FROM tanaman")
    fun getAll(): List<Tanaman>

    @Query("SELECT * FROM tanaman WHERE kode IN (:userIds)")
    fun loadAllByIds(userIds: IntArray): List<Tanaman>

    @Query("SELECT * FROM tanaman WHERE namatanaman LIKE :namatanaman AND " +
            "stock LIKE :stock LIMIT 1")
    fun findByName(namatanaman: String, stock: String): Tanaman

    @Insert
    fun insertAll(vararg tanaman: Tanaman)

    @Delete
    fun delete(tanaman: Tanaman)
}
