package com.example.challenger.repository

import com.example.challenger.entity.UserEntity

interface UserRepository {
    fun findById(userId: Long): UserEntity?
}
