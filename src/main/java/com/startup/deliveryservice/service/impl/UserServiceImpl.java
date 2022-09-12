package com.startup.deliveryservice.service.impl;

import com.startup.deliveryservice.dto.RegisterUserDto;
import com.startup.deliveryservice.model.User;
import com.startup.deliveryservice.model.enums.Role;
import com.startup.deliveryservice.model.enums.Status;
import com.startup.deliveryservice.repository.UserRepository;
import com.startup.deliveryservice.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class UserServiceImpl implements UserService {

  private final static String USER_NOT_FOUND_MSG = "User with email %s not found";
  private final UserRepository userRepository;
  private final PasswordEncoder passwordEncoder;

  @Override
  public void registerNewUser(RegisterUserDto registerUserDto) {
    userRepository.save(User.builder()
        .email(registerUserDto.getEmail())
        .username(registerUserDto.getUsername())
        .firstName(registerUserDto.getFirstName())
        .lastName(registerUserDto.getLastName())
        .password(passwordEncoder.encode(registerUserDto.getPassword()))
        .role(Role.USER)
        .status(Status.ACTIVE)
        .build());
  }
}
