package com.example.financeapp.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.LayoutInflater.*
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import com.example.financeapp.R

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

    override fun getView(positon: Int, view: View?, parent: ViewGroup?): View {
        return from(context).inflate(R.layout.transaction_item, parent, false)
    }
}