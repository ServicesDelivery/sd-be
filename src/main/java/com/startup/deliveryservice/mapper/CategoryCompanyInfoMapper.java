package com.startup.deliveryservice.mapper;

import com.startup.deliveryservice.dto.CategoryCompanyInfoDto;
import com.startup.deliveryservice.model.CategoryEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.ReportingPolicy;

import java.util.List;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface CategoryCompanyInfoMapper {

  @Mapping(target = "parentCategoryId", source = "entity.parentCategory.id")
  CategoryCompanyInfoDto toDto(CategoryEntity entity);

  List<CategoryCompanyInfoDto> toDtoList(List<CategoryEntity> entities);

}
