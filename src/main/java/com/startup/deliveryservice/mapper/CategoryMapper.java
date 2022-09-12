package com.startup.deliveryservice.mapper;

import com.startup.deliveryservice.dto.CategoryDto;
import com.startup.deliveryservice.model.CategoryEntity;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface CategoryMapper {

  CategoryDto toDto(CategoryEntity entity);
}
