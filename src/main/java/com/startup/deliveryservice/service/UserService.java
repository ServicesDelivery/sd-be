package com.startup.deliveryservice.service;

import com.startup.deliveryservice.dto.RegisterUserDto;
import com.startup.deliveryservice.dto.UserInfoDto;

public interface UserService {

  void registerNewUser(RegisterUserDto registerUserDto);

  UserInfoDto getUserById(Integer id);
}
