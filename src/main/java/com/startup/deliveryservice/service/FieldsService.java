package com.startup.deliveryservice.service;

import com.startup.deliveryservice.dto.CategoryDto;

import java.util.List;
import java.util.Map;

public interface FieldsService {

  Map<String, Object> getFields();

  List<CategoryDto> getCategoryFields();
}
