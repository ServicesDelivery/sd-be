package com.startup.deliveryservice.repository;

import com.startup.deliveryservice.model.CompanyEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CompanyRepository extends JpaRepository<CompanyEntity, Integer> {

}
