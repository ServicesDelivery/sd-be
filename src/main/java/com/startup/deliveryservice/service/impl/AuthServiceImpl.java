package com.startup.deliveryservice.service.impl;

import com.startup.deliveryservice.dto.AuthenticatedUserDto;
import com.startup.deliveryservice.exception.OperationIsNotAllowed;
import com.startup.deliveryservice.mapper.AuthenticatedUserMapper;
import com.startup.deliveryservice.model.User;
import com.startup.deliveryservice.repository.UserRepository;
import com.startup.deliveryservice.service.AuthService;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AuthServiceImpl implements AuthService {

  private final UserRepository userRepository;
  private final AuthenticatedUserMapper authenticatedUserMapper;

  @Override
  public AuthenticatedUserDto getCurrentUser() {
    Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
    if (authentication == null || !authentication.isAuthenticated()) {
      throw new OperationIsNotAllowed("User is not Authenticated");
    }
    String email = authentication.getName();
    User user = userRepository.findByEmail(email).orElseThrow(() ->
        new UsernameNotFoundException("User with email " + email + " doesn't exists"));
    return authenticatedUserMapper.toDto(user);
  }
}
