package com.example.challenger.exception

import org.springframework.http.HttpStatus

class UserNotFoundException() : BaseException(HttpStatus.NOT_FOUND, "유저를 찾을 수 없습니다.")
