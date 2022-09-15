package com.startup.deliveryservice.service.impl;

import com.startup.deliveryservice.dto.RegisterUserDto;
import com.startup.deliveryservice.dto.UserInfoDto;
import com.startup.deliveryservice.exception.NoSuchElementException;
import com.startup.deliveryservice.mapper.UserInfoMapper;
import com.startup.deliveryservice.model.User;
import com.startup.deliveryservice.model.UserInfoEntity;
import com.startup.deliveryservice.model.enums.Role;
import com.startup.deliveryservice.model.enums.Status;
import com.startup.deliveryservice.repository.UserInfoRepository;
import com.startup.deliveryservice.repository.UserRepository;
import com.startup.deliveryservice.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class UserServiceImpl implements UserService {

  private final UserRepository userRepository;
  private final UserInfoRepository userInfoRepository;
  private final PasswordEncoder passwordEncoder;
  private final UserInfoMapper userInfoMapper;

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

  public UserInfoDto getUserById(Integer id) {
    UserInfoEntity user = userInfoRepository.findByUserId(id)
        .orElseThrow(() -> new NoSuchElementException("No user info with id: " + id));
    return userInfoMapper.toDto(user);
  }
}
