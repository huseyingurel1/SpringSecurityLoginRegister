package com.huseyingurel.registrationloginspringbootsecuritythymeleaf.service;


import com.huseyingurel.registrationloginspringbootsecuritythymeleaf.model.User;
import com.huseyingurel.registrationloginspringbootsecuritythymeleaf.web.dto.UserRegistrationDto;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface IUserService extends UserDetailsService {
    User save(UserRegistrationDto registrationDto);

}
