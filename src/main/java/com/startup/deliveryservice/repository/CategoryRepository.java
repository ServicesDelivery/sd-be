package com.startup.deliveryservice.repository;

import com.startup.deliveryservice.model.CategoryEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CategoryRepository extends JpaRepository<CategoryEntity, Integer> {

  @Query("select c from CategoryEntity c where c.parentCategory is null order by c.name")
  List<CategoryEntity> findAllCategories();
}
