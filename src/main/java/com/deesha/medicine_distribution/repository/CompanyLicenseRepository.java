//package com.deesha.medicine_distribution.repository;
//
//import com.deesha.medicine_distribution.model.CompanyLicense;
//import org.springframework.data.jpa.repository.EntityGraph;
//import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.stereotype.Repository;
//
//import java.util.List;
//import java.util.Optional;
//
//@Repository
//public interface CompanyLicenseRepository extends JpaRepository<CompanyLicense, Long> {
//
//    // Fetch company and licenseType in the same query to avoid N+1 selects
//    @Override
//    @EntityGraph(attributePaths = {"company", "licenseType"})
//    List<CompanyLicense> findAll();
//
//    @Override
//    @EntityGraph(attributePaths = {"company", "licenseType"})
//    Optional<CompanyLicense> findById(Long id);
//}