package com.example.challenger.exception

import org.springframework.http.HttpStatus

data class ErrorResponse(
    val statusCode: HttpStatus,
    val message: String
)
