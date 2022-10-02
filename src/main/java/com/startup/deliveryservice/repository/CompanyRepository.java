package com.startup.deliveryservice.repository;

import com.startup.deliveryservice.model.CompanyEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface CompanyRepository extends JpaRepository<CompanyEntity, Integer>,
    JpaSpecificationExecutor<CompanyEntity> {

}
