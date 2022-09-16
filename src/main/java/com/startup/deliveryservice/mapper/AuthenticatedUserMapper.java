package com.startup.deliveryservice.mapper;

import com.startup.deliveryservice.dto.AuthenticatedUserDto;
import com.startup.deliveryservice.model.User;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface AuthenticatedUserMapper {

  AuthenticatedUserDto toDto(User user);
}
