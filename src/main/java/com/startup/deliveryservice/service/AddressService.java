package com.startup.deliveryservice.service;

import com.startup.deliveryservice.dto.AddressDto;
import com.startup.deliveryservice.dto.request.AddressRequestDto;

public interface AddressService {

  AddressDto addAddressToUser(AddressRequestDto addressDto);

  void deleteAddressFromUser(Integer addressId);

}
