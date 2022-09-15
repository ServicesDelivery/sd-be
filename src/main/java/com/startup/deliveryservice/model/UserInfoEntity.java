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
@Table(name = "user_info")
public class UserInfoEntity {

  @Id
  @Column(name = "user_id")
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer userId;

  @ManyToMany(fetch = FetchType.LAZY)
  @JoinTable(name = "user_info_address", joinColumns = @JoinColumn(name = "user_info_id"),
      inverseJoinColumns = @JoinColumn(name = "address_id"))
  private List<AddressEntity> addresses;
}
