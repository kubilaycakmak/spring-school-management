package com.groupd.springschoolmanagement.service;

import com.groupd.springschoolmanagement.dto.UserRegistrationDto;
import com.groupd.springschoolmanagement.model.Account;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserService extends UserDetailsService {
    Account save(UserRegistrationDto registrationDto);
}
