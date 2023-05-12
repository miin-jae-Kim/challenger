package com.example.challenger.repository

import com.example.challenger.entity.Challenge
import com.example.challenger.entity.ChallengeEntity
import jakarta.persistence.EntityManager
import org.springframework.stereotype.Repository

@Repository
class ChallengeRepositoryImpl(
    private val em: EntityManager
) : ChallengeRepository {
    override fun findById(challengeId: Long): ChallengeEntity? =
        em.find(ChallengeEntity::class.java, challengeId)

    override fun create(challenge: Challenge): ChallengeEntity {
        TODO("Not yet implemented")
    }
}
