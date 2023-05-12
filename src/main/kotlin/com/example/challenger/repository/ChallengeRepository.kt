package com.example.challenger.repository

import com.example.challenger.entity.Challenge
import com.example.challenger.entity.ChallengeEntity

interface ChallengeRepository {
    fun findById(challengeId: Long): ChallengeEntity?
    fun create(challenge: Challenge): ChallengeEntity
}
