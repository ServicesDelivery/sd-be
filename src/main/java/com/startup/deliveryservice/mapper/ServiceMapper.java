package com.startup.deliveryservice.mapper;

import com.startup.deliveryservice.dto.ServiceDto;
import com.startup.deliveryservice.model.ServiceEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.ReportingPolicy;

import java.util.List;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface ServiceMapper {

  @Mapping(target = "categoryId", source = "entity.category.id")
  ServiceDto toDto(ServiceEntity entity);

  List<ServiceDto> toDtoList(List<ServiceEntity> entities);
}
