package com.startup.deliveryservice.controller;

import com.startup.deliveryservice.dto.CompanyDto;
import com.startup.deliveryservice.dto.CompanyQueueDto;
import com.startup.deliveryservice.dto.CompanyQueueFilterDto;
import com.startup.deliveryservice.service.CompanyService;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/companies")
@AllArgsConstructor
public class CompanyController {

  private final CompanyService companyService;

  @GetMapping("/test")
  public ResponseEntity<List<CompanyDto>> test() {
    return ResponseEntity.ok(companyService.getAllCompanies());
  }

  @GetMapping()
  public ResponseEntity<List<CompanyQueueDto>> getAllCompanies(Pageable pageable, CompanyQueueFilterDto dto) {
    return ResponseEntity.ok(companyService.getCompanies(pageable, dto));
  }

  @GetMapping("/{id}")
  public ResponseEntity<CompanyDto> getCompanyById(@PathVariable Integer id) {
    return ResponseEntity.ok(companyService.getCompanyById(id));
  }
}
