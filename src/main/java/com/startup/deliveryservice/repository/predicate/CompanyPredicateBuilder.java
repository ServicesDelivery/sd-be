package com.startup.deliveryservice.repository.predicate;

import com.startup.deliveryservice.dto.CompanyQueueFilterDto;
import lombok.Getter;
import lombok.Setter;
import org.jooq.Condition;
import org.jooq.impl.DSL;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import static jooq.deliveryservice.database.tables.Company.COMPANY;

@Getter
@Setter
public class CompanyPredicateBuilder {

  protected CompanyQueueFilterDto dto;

  public static CompanyPredicateBuilder from(CompanyQueueFilterDto dto) {
    CompanyPredicateBuilder builder = new CompanyPredicateBuilder();
    builder.setDto(dto);
    return builder;
  }

  public Condition build() {
    List<Condition> conditions = new ArrayList<>();

    generateNameCondition(conditions);

    return DSL.and(conditions);
  }

  private void generateNameCondition(List<Condition> conditions) {
    if (Objects.nonNull(dto.getName())) {
      conditions.add(COMPANY.NAME.like("%" + dto.getName() + "%"));
    }
  }
}
