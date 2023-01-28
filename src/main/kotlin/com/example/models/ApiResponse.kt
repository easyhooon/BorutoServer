package com.example.models

import kotlinx.serialization.Serializable

//convert object as JSON (send objects as a response, we need to be able to convert them as JSON)
@Serializable
data class ApiResponse(
    val success: Boolean,
    val message: String? = null,
    val prevPage: Int? = null,
    val nextPage: Int? = null,
    val heroes: List<Hero> = emptyList(),
    val lastUpdated: Long? = null //only allHeroes endpoint need
)
