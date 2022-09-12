package com.startup.deliveryservice.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CompanyDto {

  private Integer id;
  private String name;
  private String description;
  private List<CategoryDto> category;
  private Integer price;
  private Double rating;
}
