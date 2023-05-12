package com.example.challenger.exception

import org.springframework.http.HttpStatus
import java.lang.Exception

open class BaseException(
    val statusCode: HttpStatus,
    override val message: String
) : Exception(message)
