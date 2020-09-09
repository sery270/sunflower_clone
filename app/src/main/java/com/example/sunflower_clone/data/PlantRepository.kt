package com.example.sunflower_clone.data

class PlantRepository private constructor(private val plantDao: PlantDao){

    fun getPlants() = plantDao.getPlants()

    fun getPlant(plantId: String) = plantDao.getPlant(plantId)

    fun getPlantWithGrowZoneNumber(growZoneNumber: Int) =
        plantDao.getPlantsWithGrowZoneNumber(growZoneNumber)

    companion object{

        @Volatile private var instance: PlantRepository? = null

        fun getInstance(plantDao: PlantDao) =
            instance ?: synchronized(this){
                instance ?: PlantRepository(plantDao).also { instance = it }
            }
    }
}