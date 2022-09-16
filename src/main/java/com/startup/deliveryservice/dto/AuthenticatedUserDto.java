package com.startup.deliveryservice.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class AuthenticatedUserDto {

  private Integer id;
  private String username;
  private String lastName;
  private String firstName;
  private String email;
}
