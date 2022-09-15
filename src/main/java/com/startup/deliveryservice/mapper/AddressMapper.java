package com.startup.deliveryservice.mapper;

import com.startup.deliveryservice.dto.AddressDto;
import com.startup.deliveryservice.model.AddressEntity;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE,
    uses = DistrictMapper.class)
public interface AddressMapper {

  AddressDto toDto(AddressEntity entity);
}
