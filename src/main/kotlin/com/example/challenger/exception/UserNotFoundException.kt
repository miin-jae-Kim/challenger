package com.example.challenger.exception

import org.springframework.http.HttpStatus

class UserNotFoundException() : BaseException(HttpStatus.NOT_FOUND, "User NOT FOUND")
