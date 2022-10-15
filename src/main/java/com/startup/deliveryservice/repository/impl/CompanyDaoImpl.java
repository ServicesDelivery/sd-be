package com.startup.deliveryservice.repository.impl;

import com.startup.deliveryservice.mapper.CompanyQueueMapperV1;
import com.startup.deliveryservice.repository.CompanyDao;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Repository;

@Repository
@Slf4j
@RequiredArgsConstructor
public class CompanyDaoImpl implements CompanyDao {

  private final CompanyQueueMapperV1 companyQueueMapperV1;

  /*@Override
  public List<CompanyQueueDtoV1> getAggregatedCompanies(Pageable pageable, Condition conditions) {
    return companyQueueMapperV1.mapList(
        getCompanies(conditions)
            //.orderBy(DSL.field("name asc"))
            .limit(pageable.getPageSize())
            .offset(pageable.getOffset())
            .fetch());
  }

  private SelectHavingStep<Record6<Integer, String, String, String, Double, String>> getCompanies(
      Condition conditions) {
    return dsl.select(
            COMPANY.ID,
            COMPANY.NAME,
            COMPANY.DESCRIPTION,
            COMPANY.PRICE,
            COMPANY.RATING,
            groupConcat(CATEGORY.NAME).separator(", ").as("categories"))
        .from(COMPANY)
        .join(COMPANY_CATEGORY).on(COMPANY_CATEGORY.COMPANY_ID.eq(COMPANY.ID))
        .join(CATEGORY).on(CATEGORY.ID.eq(COMPANY_CATEGORY.CATEGORY_ID))
        .where(conditions)
        .groupBy(COMPANY.ID);
  }*/
}
