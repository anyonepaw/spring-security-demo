package com.spring.securitydemo

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class SecurityDemoApplication

fun main(args: Array<String>) {
	runApplication<SecurityDemoApplication>(*args)
}