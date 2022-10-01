package com.startup.deliveryservice.mapper;

import com.startup.deliveryservice.dto.CompanyQueueDto;
import lombok.RequiredArgsConstructor;
import org.jooq.Record;
import org.jooq.Record6;
import org.jooq.Result;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

import static jooq.deliveryservice.database.tables.Company.COMPANY;

@Component
@RequiredArgsConstructor
public class CompanyQueueMapper {

  public List<CompanyQueueDto> mapList(
      Result<Record6<Integer, String, String, String, Double, String>> records) {
    List<CompanyQueueDto> companyDtos = new ArrayList<>();
    for (Record record : records) {
      CompanyQueueDto dto = new CompanyQueueDto();
      dto.setId(record.getValue(COMPANY.ID));
      dto.setName(record.getValue(COMPANY.NAME));
      dto.setDescription(record.getValue(COMPANY.DESCRIPTION));
      dto.setPrice(record.getValue(COMPANY.PRICE));
      dto.setRating(record.getValue(COMPANY.RATING));
      dto.setCategories(record.get("categories", String.class));
      companyDtos.add(dto);
    }
    return companyDtos;
  }
}
