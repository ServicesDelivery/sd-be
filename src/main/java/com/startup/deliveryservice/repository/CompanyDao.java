package com.startup.deliveryservice.repository;

import com.startup.deliveryservice.dto.CompanyQueueDtoV1;
import org.jooq.Condition;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface CompanyDao {

  List<CompanyQueueDtoV1> getAggregatedCompanies(Pageable pageable, Condition conditions);
}
