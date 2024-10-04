package com.example.hw1_m4

import java.io.Serializable

data class User(
    val name: String,
    val email: String,
    val password: String
) : Serializable

