package com.startup.deliveryservice.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CompanyQueueDtoV1 {

  private Integer id;
  private String name;
  private String description;
  private String categories;
  private String price;
  private Double rating;
}
