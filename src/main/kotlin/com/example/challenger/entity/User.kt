package com.example.challenger.entity

import java.util.UUID

data class User(
    val id: UUID,
    val email: String,
    val name: String,
    val password: String
)
