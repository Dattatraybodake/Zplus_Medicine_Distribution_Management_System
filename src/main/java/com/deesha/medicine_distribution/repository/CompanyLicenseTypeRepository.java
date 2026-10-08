//package com.deesha.medicine_distribution.repository;
//
//import com.deesha.medicine_distribution.model.CompanyLicenseType;
//import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.stereotype.Repository;
//
//@Repository
//public interface CompanyLicenseTypeRepository extends JpaRepository<CompanyLicenseType, Long> {
//
//    boolean existsByLicenseType(String licenseType);
//
//    boolean existsByLicenseTypeAndLicenseTypeIdNot(String licenseType, Long licenseTypeId);
//}