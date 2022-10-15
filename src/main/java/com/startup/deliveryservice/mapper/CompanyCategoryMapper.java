package com.startup.deliveryservice.mapper;

import com.startup.deliveryservice.dto.CategoryCompanyInfoDto;
import com.startup.deliveryservice.model.CompanyCategoryEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.ReportingPolicy;

import java.util.List;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface CompanyCategoryMapper {

  @Mapping(target = "id", source = "entity.category.id")
  @Mapping(target = "name", source = "entity.category.name")
  @Mapping(target = "description", source = "entity.category.description")
  @Mapping(target = "order", source = "entity.order")
  @Mapping(target = "parentCategoryId", source = "entity.category.parentCategory.id")
  CategoryCompanyInfoDto toDto(CompanyCategoryEntity entity);

  List<CategoryCompanyInfoDto> toDtoList(List<CompanyCategoryEntity> entities);

}
