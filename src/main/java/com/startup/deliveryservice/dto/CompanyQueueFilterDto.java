package com.startup.deliveryservice.dto;

import lombok.Data;

import java.util.List;

@Data
public class CompanyQueueFilterDto {

  private String name;
  private List<String> categories;
  private Double ratingFrom;
  private Double ratingTo;
}
