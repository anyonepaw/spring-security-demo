package com.spring.security.demo.security.service

import com.spring.security.demo.repository.UserRepository
import org.springframework.security.core.userdetails.UserDetails
import org.springframework.security.core.userdetails.UserDetailsService
import org.springframework.stereotype.Service
import com.spring.security.demo.security.CustomerUserDetails

@Service
class CustomUserDetailsService(private val userRepository: UserRepository) : UserDetailsService {

    override fun loadUserByUsername(username: String): UserDetails {
        return CustomerUserDetails(userRepository.findOneByUserName(username)!!)
    }

}
