package com.startup.deliveryservice.mapper;

import com.startup.deliveryservice.dto.CompanyDto;
import com.startup.deliveryservice.model.CompanyEntity;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

import java.util.List;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE,
    uses = {CategoryMapper.class, ServiceMapper.class})
public interface CompanyMapper {

  CompanyDto toDto(CompanyEntity entity);

  List<CompanyDto> toDtoList(List<CompanyEntity> entities);
}
