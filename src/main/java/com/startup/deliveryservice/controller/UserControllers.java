package com.startup.deliveryservice.controller;

import com.startup.deliveryservice.dto.RegisterUserDto;
import com.startup.deliveryservice.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
@AllArgsConstructor
public class UserControllers {

  private final UserService userService;

  @GetMapping("/{username}")
  public ResponseEntity<String> getUserByUsername(@PathVariable String username) {
    //return ResponseEntity.ok(userService.loadUserByUsername(username));
    return ResponseEntity.ok("");
  }

  @PostMapping("/registration")
  public void registerNewUser(@Validated @RequestBody RegisterUserDto registerUserDto) {
    userService.registerNewUser(registerUserDto);
  }
}
