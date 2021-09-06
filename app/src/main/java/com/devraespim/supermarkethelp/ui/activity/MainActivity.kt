package com.devraespim.supermarkethelp.ui.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.devraespim.supermarkethelp.R
import com.devraespim.supermarkethelp.ui.fragment.categories.CategoriesFragment

class MainActivity : AppCompatActivity() {
    private val manager = supportFragmentManager

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(findViewById(R.id.toolbar))
        manager.beginTransaction().add(R.id.conteiner_fragment, CategoriesFragment()).commit()
    }
}