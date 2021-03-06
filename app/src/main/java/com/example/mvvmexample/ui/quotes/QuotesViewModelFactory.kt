package com.example.mvvmexample.ui.quotes

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.mvvmexample.data.QuoteRepository

class QuotesViewModelFactory(private val quoteRepository: QuoteRepository)
        : ViewModelProvider.NewInstanceFactory() {

        override fun <T : ViewModel?> create(modelClass: Class<T>): T {
            return QuotesViewModel(quoteRepository) as T
        }
}