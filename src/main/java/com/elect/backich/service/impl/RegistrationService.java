package com.elect.backich.service.impl;

import com.elect.backich.entity.Role;
import com.elect.backich.entity.User;
import com.elect.backich.registration.RegistrationRequest;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class RegistrationService {


    private final UserServiceImpl userService;


    public String register(RegistrationRequest request) {
       return userService.signUpUser(
               new User(
                       request.getUsername(),
                       request.getPassword(),
                       Role.USER
               )
       );
    }
}
