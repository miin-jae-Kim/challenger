package com.example.challenger.exception

import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.ControllerAdvice
import org.springframework.web.bind.annotation.ExceptionHandler
import org.springframework.web.bind.annotation.ResponseBody
import java.lang.Exception

@ControllerAdvice
class ExceptionHandler {
    @ExceptionHandler(BaseException::class)
    @ResponseBody
    fun handleException(exception: BaseException):ResponseEntity<ErrorResponse> {
        return ResponseEntity.status(exception.statusCode).body(
            ErrorResponse(
                statusCode = exception.statusCode,
                message = exception.message
            )
        )
    }
}
