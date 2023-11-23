package com.example.shoppinglist.ui.shoppinglist

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProviders
import com.example.shoppinglist.Data.db.ShoppingDatabese
import com.example.shoppinglist.Data.repositories.ShoppingRepository
import com.example.shoppinglist.R

class ShoppingActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_shopping)

        val databese  = ShoppingDatabese(this)
        val repository = ShoppingRepository(databese)
        val factory = ShoppingViewModelFactory(repository)

        val viewModel = ViewModelProviders.of(this,factory).get(ShoppingViewModel::class.java)
    }
}