package com.example.challenger.entity

import com.example.challenger.enum.ChallengeType
import java.time.LocalDateTime

data class Challenge(
    val id: Long,
    val title: String,
    val type: ChallengeType,
    val startAt: LocalDateTime,
    val endAt: LocalDateTime,
    val recruitStartAt: LocalDateTime,
    val recruitEndAt: LocalDateTime,
    val maxParticipantCount: Int,
    val paymentAmount: Int,
)
