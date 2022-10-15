package com.startup.deliveryservice.mapper;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class CompanyQueueMapperV1 {

 /* public List<CompanyQueueDtoV1> mapList(
      Result<Record6<Integer, String, String, String, Double, String>> records) {
    List<CompanyQueueDtoV1> companyDtos = new ArrayList<>();
    for (Record record : records) {
      CompanyQueueDtoV1 dto = new CompanyQueueDtoV1();
      dto.setId(record.getValue(COMPANY.ID));
      dto.setName(record.getValue(COMPANY.NAME));
      dto.setDescription(record.getValue(COMPANY.DESCRIPTION));
      dto.setPrice(record.getValue(COMPANY.PRICE));
      dto.setRating(record.getValue(COMPANY.RATING));
      dto.setCategories(record.get("categories", String.class));
      companyDtos.add(dto);
    }
    return companyDtos;
  }*/
}
