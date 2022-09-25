package com.startup.deliveryservice.mapper;

import com.startup.deliveryservice.dto.SubCategoryDto;
import com.startup.deliveryservice.model.SubCategoryEntity;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface SubCategoryMapper {

  SubCategoryDto toDto(SubCategoryEntity entity);
}
