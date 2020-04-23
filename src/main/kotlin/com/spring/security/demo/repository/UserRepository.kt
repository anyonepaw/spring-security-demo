package com.spring.security.demo.repository

import com.spring.security.demo.domain.User
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface UserRepository : JpaRepository<User, Long> {
    fun findOneByUserName(userName: String): User?
}
