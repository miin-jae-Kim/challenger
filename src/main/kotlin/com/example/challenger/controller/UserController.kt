package com.example.challenger.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class UserController {
    @GetMapping("/")
    fun test(): String { return "test" }
}
