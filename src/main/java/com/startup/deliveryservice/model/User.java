package com.startup.deliveryservice.model;

import com.startup.deliveryservice.model.enums.Role;
import com.startup.deliveryservice.model.enums.Status;
import com.startup.deliveryservice.model.enums.UserRole;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;
import java.util.Collections;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Getter
@Setter
@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "user")
public class User {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer id;
  @Column(name = "email")
  private String email;
  @Column(name = "username")
  private String username;
  @Column(name = "password")
  private String password;
  @Column(name = "first_name")
  private String firstName;
  @Column(name = "last_name")
  private String lastName;
  @Enumerated(value = EnumType.STRING)
  @Column(name = "role")
  private Role role;
  @Enumerated(value = EnumType.STRING)
  @Column(name = "status")
  private Status status;

}
