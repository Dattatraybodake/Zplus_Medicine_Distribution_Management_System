//package com.deesha.medicine_distribution.controller;
//
//import com.deesha.medicine_distribution.dto.CompanyLicenseResponse;
//import com.deesha.medicine_distribution.service.CompanyLicenseService;
//import jakarta.validation.Valid;
//import lombok.RequiredArgsConstructor;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.List;
//
//@RestController
//@RequestMapping("/api/company-licenses")
//@RequiredArgsConstructor
//public class CompanyLicenseController {
//
//    private final CompanyLicenseService service;
//
//    @PostMapping
//    public ResponseEntity<CompanyLicenseResponse> create(@Valid @RequestBody CompanyLicenseRequest request) {
//        return ResponseEntity.status(HttpStatus.CREATED).body(service.create(request));
//    }
//
//    @GetMapping
//    public ResponseEntity<List<CompanyLicenseResponse>> getAll() {
//        return ResponseEntity.ok(service.getAll());
//    }
//
//    @GetMapping("/{id}")
//    public ResponseEntity<CompanyLicenseResponse> getById(@PathVariable Long id) {
//        return ResponseEntity.ok(service.getById(id));
//    }
//
//    @PutMapping("/{id}")
//    public ResponseEntity<CompanyLicenseResponse> update(@PathVariable Long id,
//                                                         @Valid @RequestBody CompanyLicenseRequest request) {
//        return ResponseEntity.ok(service.update(id, request));
//    }
//
//    @DeleteMapping("/{id}")
//    public ResponseEntity<Void> delete(@PathVariable Long id) {
//        service.delete(id);
//        return ResponseEntity.noContent().build();
//    }
//}