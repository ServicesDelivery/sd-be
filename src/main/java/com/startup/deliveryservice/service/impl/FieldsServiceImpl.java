package com.startup.deliveryservice.service.impl;

import com.startup.deliveryservice.dto.CategoryDto;
import com.startup.deliveryservice.mapper.CategoryMapper;
import com.startup.deliveryservice.model.CategoryEntity;
import com.startup.deliveryservice.repository.CategoryRepository;
import com.startup.deliveryservice.service.FieldsService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import static java.util.stream.Collectors.toMap;

@Service
@AllArgsConstructor
public class FieldsServiceImpl implements FieldsService {

  private final CategoryRepository categoryRepository;
  private final CategoryMapper categoryMapper;

  @Override
  public Map<String, Object> getFields() {
    Map<String, Object> fields = new LinkedHashMap<>();
    fields.put("categories", getCategoryFields());
    return fields;
  }

  private List<CategoryDto> getCategoryFields() {
    /*return categoryRepository.findAllByOrderByName()
        .stream()
        .collect(toMap(CategoryEntity::getId, CategoryEntity::getName));*/
    List<CategoryEntity> categories = categoryRepository.findAllCategories();
    return categoryMapper.toDtoList(categories);
  }
}
