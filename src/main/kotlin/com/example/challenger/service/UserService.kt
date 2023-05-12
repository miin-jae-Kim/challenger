package com.example.challenger.service

import com.example.challenger.entity.User

interface UserService {
    fun getById(userId: Long): User
}
