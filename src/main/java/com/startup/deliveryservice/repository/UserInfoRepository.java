package com.startup.deliveryservice.repository;

import com.startup.deliveryservice.model.UserInfoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

public interface UserInfoRepository extends JpaRepository<UserInfoEntity, Integer> {

  //@Query("select u from UserInfoEntity u where user_id = :userId")
  Optional<UserInfoEntity> findByUserId(Integer userId);

}
