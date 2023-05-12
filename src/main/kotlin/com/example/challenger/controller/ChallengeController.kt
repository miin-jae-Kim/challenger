package com.example.challenger.controller

import com.example.challenger.entity.Challenge
import com.example.challenger.service.ChallengeService
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.ResponseStatus
import org.springframework.web.bind.annotation.RestController

@RestController
class ChallengeController(
    private val challengeService: ChallengeService
) {
    @GetMapping("/challengers/{challengerId}")
    @ResponseStatus(HttpStatus.OK)
    fun findById(
        @PathVariable("challengerId") challengerId: Long
    ): ResponseEntity<Challenge> {
        val challenge = challengeService.getById(challengerId)
        return ResponseEntity.ok().body(challenge)
    }
}
