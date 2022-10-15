package com.startup.deliveryservice.mapper;

import com.startup.deliveryservice.dto.CompanyQueueDto;
import com.startup.deliveryservice.model.CompanyEntity;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

import java.util.List;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE,
    uses = {CompanyCategoryMapper.class})
public interface CompanyQueueMapper {

  CompanyQueueDto toDto(CompanyEntity entity);

  List<CompanyQueueDto> toDtoList(List<CompanyEntity> entities);
}
