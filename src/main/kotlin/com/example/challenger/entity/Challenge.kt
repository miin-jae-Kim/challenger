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
) {
    companion object {
        fun of(challengeEntity: ChallengeEntity): Challenge =
            Challenge(
                id = challengeEntity.id,
                title = challengeEntity.title,
                type = challengeEntity.type,
                startAt = challengeEntity.startAt,
                endAt = challengeEntity.endAt,
                recruitStartAt = challengeEntity.recruitStartAt,
                recruitEndAt = challengeEntity.recruitEndAt,
                maxParticipantCount = challengeEntity.maxParticipantCount,
                paymentAmount = challengeEntity.paymentAmount
            )
    }
}
