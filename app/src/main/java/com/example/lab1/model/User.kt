package com.example.lab1.model

import com.example.lab1.R

data class User(
    val id: Int,
    val name: String,
    val avatar: Int,
    val numberOfFolowers: Int,
    val numberOfFolowed: Int,
    val numberOfPosts: Int,
    val userDescription: String,
    val country: String,
    val city: String
) {
    companion object {
        val example = User(
            id = 1,
            name = "John D",
            R.drawable.avatar_1,
            numberOfFolowers = 1000,
            numberOfFolowed = 1000,
            numberOfPosts = 100,
            userDescription = "DESCRIPTION description Description",
            country = "Ukraine",
            city = "Kyiv"
        )

        val example2 = User(
            id = 2,
            name = "Jane D",
            R.drawable.avatar_2,
            numberOfFolowers = 1000,
            numberOfFolowed = 1000,
            numberOfPosts = 100,
            userDescription = "DESCRIPTION description Description",
            country = "Ukraine",
            city = "Kyiv"
        )
    }
}
