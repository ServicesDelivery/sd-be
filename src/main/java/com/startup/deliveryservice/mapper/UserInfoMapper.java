package com.startup.deliveryservice.mapper;

import com.startup.deliveryservice.dto.UserInfoDto;
import com.startup.deliveryservice.model.UserInfoEntity;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE,
    uses = AddressMapper.class)
public interface UserInfoMapper {

  UserInfoDto toDto(UserInfoEntity entity);
}
