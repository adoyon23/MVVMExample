package com.example.mvvmexample.utilities

import com.example.mvvmexample.data.FakeDatabase
import com.example.mvvmexample.data.QuoteRepository
import com.example.mvvmexample.ui.quotes.QuotesViewModelFactory

object InjectorUtils {

    fun provideQuotesViewModelFactory(): QuotesViewModelFactory {
        val quoteRepository = QuoteRepository.getInstance(FakeDatabase.getInstance().quoteDao)
        return QuotesViewModelFactory(quoteRepository)
    }
}