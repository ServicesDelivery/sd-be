package com.startup.deliveryservice.service.impl;

import com.startup.deliveryservice.model.CategoryEntity;
import com.startup.deliveryservice.repository.CategoryRepository;
import com.startup.deliveryservice.service.FieldsService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.LinkedHashMap;
import java.util.Map;

import static java.util.stream.Collectors.toMap;

@Service
@AllArgsConstructor
public class FieldsServiceImpl implements FieldsService {

  private final CategoryRepository categoryRepository;

  @Override
  public Map<String, Object> getFields() {
    Map<String, Object> fields = new LinkedHashMap<>();
    fields.put("categories", getCategoryFields());
    return fields;
  }

  private Map<Integer, ?> getCategoryFields() {
    return categoryRepository.findAllByOrderByName()
        .stream()
        .collect(toMap(CategoryEntity::getId, CategoryEntity::getName));
  }
}
