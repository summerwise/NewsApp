package com.newstestproject.domain.repository

import com.newstestproject.core.util.Resource
import com.newstestproject.util.NewsSortType
import com.newstestproject.domain.model.Article
import com.newstestproject.util.CategoryName
import kotlinx.coroutines.flow.Flow
import java.time.LocalDate

interface NewsRepository {

    fun getAllNews(keyWord: String, sortBy: NewsSortType): Flow<Resource<List<Article>>>
    fun getTopArticles(categories: List<CategoryName>, keyWord: String? = null): Flow<Resource<List<Article>>>
    fun getAllCategories(): List<CategoryName>
}