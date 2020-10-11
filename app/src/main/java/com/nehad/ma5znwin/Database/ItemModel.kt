package com.nehad.ma5znwin.Database

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "item_table")

data class ItemModel (
    @PrimaryKey(autoGenerate = false)
    val barcode:String ,

    val amount:Int){

}