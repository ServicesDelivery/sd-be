package com.startup.deliveryservice.model;

import com.startup.deliveryservice.model.enums.Price;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Getter
@Setter
@Entity
@Table(name = "company")
public class CompanyEntity {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer id;

  @Column(name = "name", nullable = false)
  private String name;

  @Column(name = "description", nullable = false)
  private String description;

  @Enumerated(EnumType.STRING)
  @Column(name = "price")
  private Price price;

  @Column(name = "rating")
  private Double rating;

  @ManyToMany(fetch = FetchType.LAZY)
  @JoinTable(name = "company_category", joinColumns = @JoinColumn(name = "company_id"),
      inverseJoinColumns = @JoinColumn(name = "category_id"))
  private List<CategoryEntity> categories;

  @OneToMany(fetch = FetchType.LAZY, mappedBy = "company")
  private List<ServiceEntity> services;
}
