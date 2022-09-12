package com.startup.deliveryservice.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class RegisterUserDto {

  private String username;
  private String firstName;
  private String lastName;
  private String email;
  private String password;

}
