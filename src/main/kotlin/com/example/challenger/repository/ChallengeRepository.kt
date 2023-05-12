package com.example.challenger.repository

import com.example.challenger.entity.Challenge
import com.example.challenger.entity.ChallengeEntity
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface ChallengeRepository: JpaRepository<ChallengeEntity, Long> {
}
