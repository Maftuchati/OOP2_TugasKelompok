package Database

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "tanaman")
data class Tanaman (
    @PrimaryKey(autoGenerate = true) val id: Int,
    @ColumnInfo(name = "namatanaman") val namatanaman: String,
    @ColumnInfo(name = "stock") val stock: String
)
