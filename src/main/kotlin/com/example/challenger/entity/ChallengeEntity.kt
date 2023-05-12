package com.example.challenger.entity

import com.example.challenger.enum.ChallengeType
import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import java.time.LocalDateTime

@Entity(name = "challenges")
data class ChallengeEntity(
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long,

    @Column(nullable = false)
    val title: String,

    @Column(nullable = false)
    val type: ChallengeType,

    @Column(nullable = false)
    val startAt: LocalDateTime,

    @Column(nullable = false)
    val endAt: LocalDateTime,

    @Column(nullable = false)
    val recruitStartAt: LocalDateTime,

    @Column(nullable = false)
    val recruitEndAt: LocalDateTime,

    @Column(nullable = false)
    val maxParticipantCount: Int = 1,

    @Column(nullable = false)
    val paymentAmount: Int = 100,
)
