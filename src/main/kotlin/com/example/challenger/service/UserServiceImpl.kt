package com.example.challenger.service

import com.example.challenger.entity.User
import com.example.challenger.exception.UserNotFoundException
import com.example.challenger.repository.UserRepository
import org.springframework.stereotype.Service

@Service
class UserServiceImpl(
    private val userRepository: UserRepository
): UserService {
    override fun getById(userId: Long): User {
        val user = userRepository.findById(userId) ?: throw UserNotFoundException()
        return User(
            id = user.id,
            email = user.email,
            name = user.name,
            password = user.password
        )
    }
}
