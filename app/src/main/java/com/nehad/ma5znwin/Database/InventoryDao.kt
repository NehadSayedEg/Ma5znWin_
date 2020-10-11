package com.nehad.ma5znwin.Database

import androidx.lifecycle.LiveData
import androidx.room.*

@Dao
interface InventoryDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertItem(itemModel: ItemModel)

    @Update
    suspend fun updateItem(itemModel: ItemModel)

    @Delete
    suspend fun deleteItem(itemModel: ItemModel)

    @Query("DELETE FROM item_table")
    suspend fun deleteAll()// : Int

    @Query("SELECT * FROM item_table")
    fun getAllItems(): LiveData<List<ItemModel>>


}