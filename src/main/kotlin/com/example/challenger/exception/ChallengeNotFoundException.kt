package com.example.challenger.exception

import org.springframework.http.HttpStatus

class ChallengeNotFoundException() : BaseException(HttpStatus.NOT_FOUND, "챌린지를 찾을 수 없습니다.")
