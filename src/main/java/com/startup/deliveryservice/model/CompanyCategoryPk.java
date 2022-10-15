package com.startup.deliveryservice.model;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Embeddable;

@Getter
@Setter
@Embeddable
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class CompanyCategoryPk implements Serializable {

  @Column(name = "company_id")
  private Integer companyId;

  @Column(name = "category_id")
  private Integer categoryId;
}
