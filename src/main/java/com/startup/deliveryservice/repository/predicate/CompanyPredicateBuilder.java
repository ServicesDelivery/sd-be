package com.startup.deliveryservice.repository.predicate;

import com.startup.deliveryservice.dto.CompanyQueueFilterDto;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class CompanyPredicateBuilder {

  protected CompanyQueueFilterDto dto;

  public static CompanyPredicateBuilder from(CompanyQueueFilterDto dto) {
    CompanyPredicateBuilder builder = new CompanyPredicateBuilder();
    builder.setDto(dto);
    return builder;
  }

  /*public Condition build() {
    List<Condition> conditions = new ArrayList<>();

    generateNameCondition(conditions);
    generateRatingCondition(conditions);

    return DSL.and(conditions);
  }*/

  /*private void generateNameCondition(List<Condition> conditions) {
    if (Objects.nonNull(dto.getName())) {
      conditions.add(COMPANY.NAME.like("%" + dto.getName() + "%"));
    }
  }

  private void generateRatingCondition(List<Condition> conditions) {
    if (Objects.nonNull(dto.getRatingFrom())) {
      conditions.add(COMPANY.RATING.ge(dto.getRatingFrom()));
    }
    if (Objects.nonNull(dto.getRatingTo())) {
      conditions.add(COMPANY.RATING.le(dto.getRatingTo()));
    }
  }*/
}
