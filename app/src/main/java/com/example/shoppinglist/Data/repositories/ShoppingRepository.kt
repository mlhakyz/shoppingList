package com.example.shoppinglist.Data.repositories

import com.example.shoppinglist.Data.db.ShoppingDatabese
import com.example.shoppinglist.Data.db.entities.ShoppingItem

class ShoppingRepository(
    private val db: ShoppingDatabese
) {

     suspend fun upsert(item: ShoppingItem) = db.getShoppingDao().upsert(item)

    suspend fun delete(item: ShoppingItem) = db.getShoppingDao().delete(item)

    fun getAllShoppingItems() = db.getShoppingDao().getAllShoppingItems()

}