package com.startup.deliveryservice.service.impl;

import com.startup.deliveryservice.dto.AddressDto;
import com.startup.deliveryservice.dto.AuthenticatedUserDto;
import com.startup.deliveryservice.dto.request.AddressRequestDto;
import com.startup.deliveryservice.exception.NoSuchElementException;
import com.startup.deliveryservice.exception.OperationIsNotAllowed;
import com.startup.deliveryservice.mapper.AddressMapper;
import com.startup.deliveryservice.model.AddressEntity;
import com.startup.deliveryservice.model.UserInfoEntity;
import com.startup.deliveryservice.repository.AddressRepository;
import com.startup.deliveryservice.repository.UserInfoRepository;
import com.startup.deliveryservice.service.AddressService;
import com.startup.deliveryservice.service.AuthService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class AddressServiceImpl implements AddressService {

  private final UserInfoRepository userInfoRepository;
  private final AddressRepository addressRepository;
  private final AddressMapper addressMapper;
  private final AuthService authService;

  @Override
  public AddressDto addAddressToUser(AddressRequestDto addressRequestDto) {
    AuthenticatedUserDto currentUser = authService.getCurrentUser();
    UserInfoEntity userInfoEntity = userInfoRepository.findByUserId(currentUser.getId())
        .orElseThrow(() -> new NoSuchElementException("No user info with id: " + currentUser.getId()));
    AddressEntity addressEntity = addressMapper.toEntity(addressRequestDto);
    addressEntity.setUserInfo(userInfoEntity);
    AddressEntity saved = addressRepository.save(addressEntity);
    return addressMapper.toDto(saved);
  }

  @Override
  public void deleteAddressFromUser(Integer addressId) {
    AuthenticatedUserDto currentUser = authService.getCurrentUser();
    UserInfoEntity userInfoEntity = userInfoRepository.findByUserId(currentUser.getId())
        .orElseThrow(() -> new NoSuchElementException("No user info with id: " + currentUser.getId()));
    AddressEntity addressEntity = addressRepository.findById(addressId)
        .orElseThrow(() -> new NoSuchElementException("No address with id: " + addressId));
    if (userInfoEntity != addressEntity.getUserInfo()) {
      throw new OperationIsNotAllowed(
          "User with id " + userInfoEntity.getUserId() + " hasn't address with id " + addressId);
    } else {
      addressRepository.delete(addressEntity);
    }
  }
}
