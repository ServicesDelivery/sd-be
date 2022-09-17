package com.startup.deliveryservice.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Getter
@Setter
@Entity
@Table(name = "address")
public class AddressEntity {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer id;

  @ManyToOne()
  @JoinColumn(name = "user_info_id", nullable = false)
  private UserInfoEntity userInfo;

  @ManyToOne
  @JoinColumn(name = "district_id", nullable = false)
  private DistrictEntity district;

  @Column(name = "street", nullable = false)
  private String street;

  @Column(name = "house", nullable = false)
  private String house;

  @Column(name = "flat")
  private String flat;
}
