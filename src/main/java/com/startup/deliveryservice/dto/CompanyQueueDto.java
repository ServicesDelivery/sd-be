package com.startup.deliveryservice.dto;

import com.startup.deliveryservice.model.enums.Price;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CompanyQueueDto {

  private Integer id;
  private String name;
  private String description;
  private List<CategoryCompanyInfoDto> categories;
  private Price price;
  private Double rating;
}
