package com.startup.deliveryservice.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import javax.persistence.Table;

@Entity
@Getter
@Setter
@Table(name = "company_category")
public class CompanyCategoryEntity {

  @EmbeddedId
  private CompanyCategoryPk pk;

  @ManyToOne
  @MapsId("companyId")
  private CompanyEntity company;

  @ManyToOne
  @MapsId("categoryId")
  private CategoryEntity category;

  @Column(name = "order")
  private Integer order;
}
