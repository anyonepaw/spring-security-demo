package com.spring.security.demo.security

import com.spring.security.demo.domain.User
import org.slf4j.LoggerFactory
import org.springframework.security.core.GrantedAuthority
import org.springframework.security.core.authority.SimpleGrantedAuthority
import org.springframework.security.core.userdetails.UserDetails
import java.util.stream.Collectors

open class CustomerUserDetails : User, UserDetails {

    private val log = LoggerFactory.getLogger(CustomerUserDetails::class.java)

    constructor(user: User) : super(user)

    override fun getAuthorities(): MutableCollection<GrantedAuthority> {
        return roles
                .stream()
                .map { role ->
                    log.debug("Granting Authority to user with role: " + role.toString())
                    SimpleGrantedAuthority(role.toString())
                }
                .collect(Collectors.toList())
    }

    override fun getPassword(): String {
        return super.userPassword
    }

    override fun isEnabled(): Boolean {
        return super.enabled
    }

    override fun getUsername(): String {
        return super.userName
    }

    override fun isCredentialsNonExpired(): Boolean {
        return super.credentialsNonExpired
    }

    override fun isAccountNonExpired(): Boolean {
        return super.accountNonExpired
    }

    override fun isAccountNonLocked(): Boolean {
        return super.accountNonLocked
    }


}
