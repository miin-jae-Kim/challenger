package com.example.challenger.service

import com.example.challenger.entity.Challenge

interface ChallengeService {
    fun getById(challengeId: Long): Challenge

    fun create(challenge: Challenge): Challenge
}
