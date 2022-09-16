package com.startup.deliveryservice.service;

import com.startup.deliveryservice.dto.AuthenticatedUserDto;

public interface AuthService {

  AuthenticatedUserDto getCurrentUser();
}
