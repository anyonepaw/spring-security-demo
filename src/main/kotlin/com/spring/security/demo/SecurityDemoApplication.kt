package com.spring.security.demo

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.Bean

@SpringBootApplication
class SecurityDemoApplication

fun main(args: Array<String>) {
    runApplication<SecurityDemoApplication>(*args)
}
