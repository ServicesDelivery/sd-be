package com.startup.deliveryservice.model;

import lombok.Getter;
import lombok.Setter;

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Getter
@Setter
@Entity
@Table(name = "category")
public class CategoryEntity {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer id;

  @Column(name = "name", nullable = false)
  private String name;

  @Column(name = "description", length = 2000)
  private String description;

  @ManyToOne(fetch = FetchType.LAZY)
  private CategoryEntity parentCategory;

  @OneToMany(mappedBy = "parentCategory")
  private Set<CategoryEntity> subCategories = new HashSet<>();

}
