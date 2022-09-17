package com.startup.deliveryservice.repository;

import com.startup.deliveryservice.model.CategoryEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CategoryRepository extends JpaRepository<CategoryEntity, Integer> {

  List<CategoryEntity> findAllByOrderByName();
}
