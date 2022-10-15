package com.startup.deliveryservice.service;

import com.startup.deliveryservice.dto.CompanyDto;
import com.startup.deliveryservice.dto.CompanyQueueDto;
import com.startup.deliveryservice.dto.CompanyQueueDtoV1;
import com.startup.deliveryservice.dto.CompanyQueueFilterDto;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface CompanyService {

  List<CompanyDto> getAllCompanies();

  //List<CompanyQueueDtoV1> getCompaniesV1(Pageable pageable, CompanyQueueFilterDto dto);

  Page<CompanyQueueDto> getCompanies(Pageable pageable, CompanyQueueFilterDto dto);

  CompanyDto getCompanyById(Integer id);

}
