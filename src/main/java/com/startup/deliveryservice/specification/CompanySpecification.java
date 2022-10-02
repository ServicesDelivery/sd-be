package com.startup.deliveryservice.specification;

import com.startup.deliveryservice.dto.CompanyQueueFilterDto;
import com.startup.deliveryservice.model.CompanyEntity;
import com.startup.deliveryservice.model.CompanyEntity_;
import lombok.AllArgsConstructor;
import org.springframework.data.jpa.domain.Specification;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

@AllArgsConstructor
public class CompanySpecification implements Specification<CompanyEntity> {

  private final CompanyQueueFilterDto filterDto;

  @Override
  public Predicate toPredicate(Root<CompanyEntity> root, CriteriaQuery<?> query, CriteriaBuilder builder) {
    final List<Predicate> predicates = new ArrayList<>();

    if (Objects.nonNull(filterDto.getName())) {
      predicates.add(builder.like(root.get(CompanyEntity_.name), "%" + filterDto.getName() + "%"));
    }
    if (Objects.nonNull(filterDto.getRatingFrom())) {
      predicates.add(builder.ge(root.get(CompanyEntity_.rating), filterDto.getRatingFrom()));
    }
    if (Objects.nonNull(filterDto.getRatingTo())) {
      predicates.add(builder.le(root.get(CompanyEntity_.rating), filterDto.getRatingTo()));
    }

    return builder.and(predicates.toArray(new Predicate[0]));
  }
}
