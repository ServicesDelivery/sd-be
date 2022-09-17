package com.startup.deliveryservice.repository;

import com.startup.deliveryservice.model.AddressEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepository extends JpaRepository<AddressEntity, Integer> {

}
