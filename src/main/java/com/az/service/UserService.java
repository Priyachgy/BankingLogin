package com.az.service;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.az.model.User;
import com.az.web.dto.UserRegistrationDto;

public interface UserService extends UserDetailsService {

    User findByEmail(String email);

    //save all the registration form fields to User table
    User save(UserRegistrationDto registration);
}
