package com.startup.deliveryservice.service.impl;

import com.startup.deliveryservice.dto.CompanyDto;
import com.startup.deliveryservice.dto.CompanyQueueDto;
import com.startup.deliveryservice.dto.CompanyQueueFilterDto;
import com.startup.deliveryservice.exception.NoSuchElementException;
import com.startup.deliveryservice.mapper.CompanyMapper;
import com.startup.deliveryservice.model.CompanyEntity;
import com.startup.deliveryservice.repository.CompanyDao;
import com.startup.deliveryservice.repository.CompanyRepository;
import com.startup.deliveryservice.repository.predicate.CompanyPredicateBuilder;
import com.startup.deliveryservice.service.CompanyService;
import lombok.AllArgsConstructor;
import org.jooq.Condition;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class CompanyServiceImpl implements CompanyService {

  private final CompanyRepository companyRepository;
  private final CompanyMapper companyMapper;
  private final CompanyDao companyDao;

  @Override
  public List<CompanyDto> getAllCompanies() {
    List<CompanyEntity> companies = companyRepository.findAll();
    return companyMapper.toDtoList(companies);
  }

  @Override
  public List<CompanyQueueDto> getCompanies(Pageable pageable, CompanyQueueFilterDto dto) {
    Condition conditions = CompanyPredicateBuilder.from(dto).build();
    return companyDao.getAggregatedCompanies(pageable, conditions);
  }

  @Override
  public CompanyDto getCompanyById(Integer id) {
    CompanyEntity company = companyRepository.findById(id)
        .orElseThrow(() -> new NoSuchElementException("No company with id: " + id));
    return companyMapper.toDto(company);
  }


}
