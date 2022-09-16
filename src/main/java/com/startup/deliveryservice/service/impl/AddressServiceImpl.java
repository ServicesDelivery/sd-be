package com.startup.deliveryservice.service.impl;

import com.startup.deliveryservice.dto.AuthenticatedUserDto;
import com.startup.deliveryservice.dto.request.AddressRequestDto;
import com.startup.deliveryservice.exception.NoSuchElementException;
import com.startup.deliveryservice.mapper.AddressMapper;
import com.startup.deliveryservice.model.AddressEntity;
import com.startup.deliveryservice.model.UserInfoEntity;
import com.startup.deliveryservice.repository.UserInfoRepository;
import com.startup.deliveryservice.service.AddressService;
import com.startup.deliveryservice.service.AuthService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class AddressServiceImpl implements AddressService {

  private final UserInfoRepository userInfoRepository;
  private final AddressMapper addressMapper;
  private final AuthService authService;

  @Override
  public UserInfoEntity addAddressToUser(AddressRequestDto addressRequestDto) {
    AuthenticatedUserDto currentUser = authService.getCurrentUser();
    UserInfoEntity userInfoEntity = userInfoRepository.findByUserId(currentUser.getId())
        .orElseThrow(() -> new NoSuchElementException("No user info with id: " + currentUser.getId()));
    AddressEntity addressEntity = addressMapper.toEntity(addressRequestDto);
    userInfoEntity.getAddresses().add(addressEntity);
    return userInfoRepository.save(userInfoEntity);
  }
}
