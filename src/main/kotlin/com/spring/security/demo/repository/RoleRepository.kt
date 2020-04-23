package com.spring.security.demo.repository

import com.spring.security.demo.domain.Role
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface RoleRepository : JpaRepository<Role, Long> {
    fun findByRoleName(roleName: String): Role
}
