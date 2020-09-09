package com.example.sunflower_clone.data

import androidx.room.*
import java.util.*


@Entity(
    tableName = "garden_plantings",
    foreignKeys = [
        ForeignKey(entity = Plant::class, parentColumns = ["id"], childColumns = ["plant_id"])
    ],
    indices = [Index("plant_id")]
)

data class GardenPlanting(
    @ColumnInfo(name = "plant_id") val plantId: String,

    @ColumnInfo(name = "plant_date") val plantDate: Calendar = Calendar.getInstance(),

    @ColumnInfo(name = "last_watering_date") val lastWateringDate: Calendar = Calendar.getInstance()

){
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "id") var gardenPlantingId: Long = 0
}