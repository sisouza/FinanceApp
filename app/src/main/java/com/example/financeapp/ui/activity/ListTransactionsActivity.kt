package com.example.financeapp.ui.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.financeapp.R

class ListTransactionsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_transactions)

        val transactions = listOf(
            "Coffee - R$ 20,50",
            "Cake - R$ 100,00"
        )


    }

}