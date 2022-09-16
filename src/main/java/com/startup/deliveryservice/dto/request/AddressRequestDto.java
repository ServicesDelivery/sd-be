package com.startup.deliveryservice.dto.request;

import com.startup.deliveryservice.dto.DistrictDto;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.jetbrains.annotations.NotNull;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class AddressRequestDto {

  @NotNull
  private DistrictDto district;
  @NotNull
  private String street;
  @NotNull
  private String house;
  private String flat;
}
