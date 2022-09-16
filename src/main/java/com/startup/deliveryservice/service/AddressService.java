package com.startup.deliveryservice.service;

import com.startup.deliveryservice.dto.request.AddressRequestDto;
import com.startup.deliveryservice.model.UserInfoEntity;

public interface AddressService {

  UserInfoEntity addAddressToUser(AddressRequestDto addressDto);

}
