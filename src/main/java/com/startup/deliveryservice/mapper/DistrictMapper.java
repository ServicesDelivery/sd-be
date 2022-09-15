package com.startup.deliveryservice.mapper;

import com.startup.deliveryservice.dto.DistrictDto;
import com.startup.deliveryservice.model.DistrictEntity;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface DistrictMapper {

  DistrictDto toDto(DistrictEntity entity);
}
