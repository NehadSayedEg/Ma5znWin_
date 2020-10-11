package com.nehad.ma5znwin.Database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(entities = [ItemModel::class] , version = 1 , exportSchema = false)
 abstract  class InventoryDatabae: RoomDatabase (){
 abstract  val  inventoryDao :InventoryDao

 companion object{
  @Volatile
  private var INSTANCE :InventoryDatabae? = null

  fun getInstance(context: Context):InventoryDatabae {
   synchronized(this) {
    var instance : InventoryDatabae?  = INSTANCE
    if(instance == null ){
      instance = Room.databaseBuilder(context.applicationContext ,InventoryDatabae::class.java , "item_table").build()
    }



   }


  }


 }
}