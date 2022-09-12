package com.startup.deliveryservice.model;

import lombok.Getter;
import lombok.Setter;

import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
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

  /*@ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "category_id", referencedColumnName = "id", insertable = false, updatable = false)*/
  @ManyToMany(fetch = FetchType.LAZY)
  @JoinTable(name = "company_category", joinColumns = @JoinColumn(name = "company_id"),
      inverseJoinColumns = @JoinColumn(name = "category_id"))
  private List<CategoryEntity> category;

  @Column(name = "price")
  private Integer price;

  @Column(name = "rating")
  private Double rating;
}
