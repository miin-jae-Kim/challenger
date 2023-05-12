package com.example.challenger.service

import com.example.challenger.entity.Challenge
import com.example.challenger.exception.ChallengeNotFoundException
import com.example.challenger.repository.ChallengeRepository
import org.springframework.stereotype.Service

@Service
class ChallengeServiceImpl(
    private val challengeRepository: ChallengeRepository
) : ChallengeService {
    override fun getById(challengeId: Long): Challenge {
        val challengeEntity = challengeRepository.findById(challengeId)
            ?: throw ChallengeNotFoundException()

        return Challenge.of(challengeEntity)
    }

    override fun create(challenge: Challenge): Challenge {
        TODO("Not yet implemented")
    }
}
