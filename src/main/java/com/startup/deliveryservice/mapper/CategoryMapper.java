package com.startup.deliveryservice.mapper;

import com.startup.deliveryservice.dto.CategoryDto;
import com.startup.deliveryservice.model.CategoryEntity;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

import java.util.List;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE,
    uses = SubCategoryMapper.class)
public interface CategoryMapper {

  CategoryDto toDto(CategoryEntity entity);

  List<CategoryDto> toDtoList(List<CategoryEntity> entities);
}
