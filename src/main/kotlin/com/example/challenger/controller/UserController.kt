package com.example.challenger.controller

import com.example.challenger.entity.User
import com.example.challenger.service.UserService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RestController

@RestController
class UserController(
    private val userService: UserService
) {
    @GetMapping("/")
    fun test(): String { return "test" }

    @GetMapping("/users/{userId}")
    fun getUser(
        @PathVariable("userId") userId: Long
    ): User {
        return userService.getById(userId)
    }
}
