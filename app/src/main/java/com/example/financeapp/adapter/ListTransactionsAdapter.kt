package com.example.financeapp.adapter

import android.content.Context
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter

class ListTransactionsAdapter(transactions: List<String>, context: Context) : BaseAdapter() {

    private val transactions = transactions
    private val context = context

    override fun getCount(): Int {
        return transactions.size
    }

    override fun getItem(position: Int): Any {
        return transactions[position]
    }

    override fun getItemId(p0: Int): Long {
        return 0
    }

    override fun getView(p0: Int, p1: View?, p2: ViewGroup?): View {
        TODO("Not yet implemented")
    }
}