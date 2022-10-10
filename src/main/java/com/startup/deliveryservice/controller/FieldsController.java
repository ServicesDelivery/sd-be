package com.startup.deliveryservice.controller;

import com.startup.deliveryservice.dto.CategoryDto;
import com.startup.deliveryservice.service.FieldsService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/fields")
@AllArgsConstructor
public class FieldsController {

  private final FieldsService fieldsService;

  @GetMapping()
  public ResponseEntity<Map<String, Object>> getFields() {
    return ResponseEntity.ok(fieldsService.getFields());
  }

  @GetMapping("/categories")
  public ResponseEntity<List<CategoryDto>> getCategories() {
    return ResponseEntity.ok(fieldsService.getCategoryFields());
  }
}
