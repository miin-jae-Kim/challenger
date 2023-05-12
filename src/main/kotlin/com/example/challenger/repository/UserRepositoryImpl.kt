package com.example.challenger.repository

import com.example.challenger.entity.UserEntity
import jakarta.persistence.EntityManager
import org.springframework.stereotype.Repository

@Repository
class UserRepositoryImpl(
    private val em: EntityManager
) : UserRepository {
    override fun findById(userId: Long): UserEntity? =
        em.find(UserEntity::class.java, userId)
}
