package com.startup.deliveryservice.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CategoryCompanyInfoDto {

  private Integer id;
  private String name;
  private String description;
  private Integer order;
  private Integer parentCategoryId;
}
