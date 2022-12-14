package com.startup.deliveryservice.controller;

import com.startup.deliveryservice.dto.AddressDto;
import com.startup.deliveryservice.dto.RegisterUserDto;
import com.startup.deliveryservice.dto.UserInfoDto;
import com.startup.deliveryservice.dto.request.AddressRequestDto;
import com.startup.deliveryservice.service.AddressService;
import com.startup.deliveryservice.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
@AllArgsConstructor
public class UserController {

  private final UserService userService;
  private final AddressService addressService;

  @GetMapping("/{username}")
  public ResponseEntity<String> getUserByUsername(@PathVariable String username) {
    //return ResponseEntity.ok(userService.loadUserByUsername(username));
    return ResponseEntity.ok("");
  }

  @PostMapping("/registration")
  public void registerNewUser(@Validated @RequestBody RegisterUserDto registerUserDto) {
    userService.registerNewUser(registerUserDto);
  }

  @GetMapping("/info/{id}")
  public ResponseEntity<UserInfoDto> getUserById(@PathVariable Integer id) {
    return ResponseEntity.ok(userService.getUserById(id));
  }

  @PostMapping("/info/addresses")
  public ResponseEntity<AddressDto> addAddressToUser(@RequestBody AddressRequestDto addressRequestDto) {
    return ResponseEntity.ok(addressService.addAddressToUser(addressRequestDto));
  }

  @DeleteMapping("/info/addresses/{addressId}")
  public void deleteAddressFromUser(@PathVariable Integer addressId) {
    addressService.deleteAddressFromUser(addressId);
  }
}
