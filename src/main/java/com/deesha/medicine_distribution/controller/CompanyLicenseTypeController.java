//package com.deesha.medicine_distribution.controller;
//
//import com.deesha.medicine_distribution.model.CompanyLicenseType;
//import com.deesha.medicine_distribution.service.CompanyLicenseTypeService;
//import lombok.RequiredArgsConstructor;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.List;
//
//@RestController
//@RequestMapping("/api/company-license-types")
//@RequiredArgsConstructor
//public class CompanyLicenseTypeController {
//
//    private final CompanyLicenseTypeService service;
//
//    @PostMapping
//    public ResponseEntity<CompanyLicenseType> create(@RequestBody CompanyLicenseType companyLicenseType) {
//        return ResponseEntity.status(HttpStatus.CREATED).body(service.create(companyLicenseType));
//    }
//
//    @GetMapping
//    public ResponseEntity<List<CompanyLicenseType>> getAll() {
//        return ResponseEntity.ok(service.getAll());
//    }
//
//    @GetMapping("/{id}")
//    public ResponseEntity<CompanyLicenseType> getById(@PathVariable Long id) {
//        return ResponseEntity.ok(service.getById(id));
//    }
//
//    @PutMapping("/{id}")
//    public ResponseEntity<CompanyLicenseType> update(@PathVariable Long id,
//                                                     @RequestBody CompanyLicenseType companyLicenseType) {
//        return ResponseEntity.ok(service.update(id, companyLicenseType));
//    }
//
//    @DeleteMapping("/{id}")
//    public ResponseEntity<Void> delete(@PathVariable Long id) {
//        service.delete(id);
//        return ResponseEntity.noContent().build();
//    }
//}