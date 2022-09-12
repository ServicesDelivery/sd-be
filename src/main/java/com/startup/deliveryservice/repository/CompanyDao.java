package com.startup.deliveryservice.repository;

import com.startup.deliveryservice.dto.CompanyQueueDto;
import org.jooq.Condition;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface CompanyDao {

  List<CompanyQueueDto> getAggregatedCompanies(Pageable pageable, Condition conditions);
}
