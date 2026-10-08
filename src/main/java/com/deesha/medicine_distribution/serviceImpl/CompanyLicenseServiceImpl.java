//package com.deesha.medicine_distribution.serviceImpl;
//
//import com.deesha.medicine_distribution.service.CompanyLicenseService;
//import com.deesha.medicine_distribution.dto.CompanyLicenseResponse;
//import com.deesha.medicine_distribution.model.Company;
//import com.deesha.medicine_distribution.model.CompanyLicense;
//import com.deesha.medicine_distribution.model.CompanyLicenseType;
//import com.deesha.medicine_distribution.repository.CompanyLicenseRepository;
//import com.deesha.medicine_distribution.repository.CompanyLicenseTypeRepository;
//import com.deesha.medicine_distribution.repository.CompanyRepository;
//import lombok.RequiredArgsConstructor;
//import org.springframework.http.HttpStatus;
//import org.springframework.stereotype.Service;
//import org.springframework.transaction.annotation.Transactional;
//import org.springframework.web.server.ResponseStatusException;
//
//import java.util.List;
//
//@Service
//@RequiredArgsConstructor
//@Transactional
//public class CompanyLicenseServiceImpl implements CompanyLicenseService {
//
//    private final CompanyLicenseRepository repository;
//    private final CompanyRepository companyRepository;                 // assumed: JpaRepository<Company, Long>
//    private final CompanyLicenseTypeRepository licenseTypeRepository;
//
//    @Override
//    public CompanyLicenseResponse create(CompanyLicenseRequest request) {
//        CompanyLicense entity = new CompanyLicense();
//        applyRequest(entity, request);
//        return toResponse(repository.save(entity));
//    }
//
//    @Override
//    @Transactional(readOnly = true)
//    public List<CompanyLicenseResponse> getAll() {
//        return repository.findAll().stream().map(this::toResponse).toList();
//    }
//
//    @Override
//    @Transactional(readOnly = true)
//    public CompanyLicenseResponse getById(Long id) {
//        return toResponse(findOrThrow(id));
//    }
//
//    @Override
//    public CompanyLicenseResponse update(Long id, CompanyLicenseRequest request) {
//        CompanyLicense entity = findOrThrow(id);
//        applyRequest(entity, request);
//        return toResponse(repository.save(entity));
//    }
//
//    @Override
//    public void delete(Long id) {
//        repository.delete(findOrThrow(id));
//    }
//
//    // ---------- helpers ----------
//
//    private CompanyLicense findOrThrow(Long id) {
//        return repository.findById(id)
//                .orElseThrow(() -> new ResponseStatusException(
//                        HttpStatus.NOT_FOUND, "Company License not found with id: " + id));
//    }
//
//    private void applyRequest(CompanyLicense entity, CompanyLicenseRequest request) {
//        if (request.issueDate() != null && request.expiryDate() != null
//                && request.expiryDate().isBefore(request.issueDate())) {
//            throw new ResponseStatusException(HttpStatus.BAD_REQUEST,
//                    "expiryDate cannot be before issueDate");
//        }
//
//        Company company = companyRepository.findById(request.companyId())
//                .orElseThrow(() -> new ResponseStatusException(
//                        HttpStatus.NOT_FOUND, "Company not found with id: " + request.companyId()));
//
//        CompanyLicenseType licenseType = licenseTypeRepository.findById(request.licenseTypeId())
//                .orElseThrow(() -> new ResponseStatusException(
//                        HttpStatus.NOT_FOUND, "CompanyLicenseType not found with id: " + request.licenseTypeId()));
//
//        entity.setCompany(company);
//        entity.setLicenseTypeId(licenseType);
//        entity.setLicenseNumber(request.licenseNumber());
//        entity.setIssueDate(request.issueDate());
//        entity.setExpiryDate(request.expiryDate());
//        if (request.isActive() != null) {
//            entity.setIsActive(request.isActive());
//        }
//    }
//
//    private CompanyLicenseResponse toResponse(CompanyLicense e) {
//        return new CompanyLicenseResponse(
//                e.getLicenseId(),
//                e.getCompany().getCompanyId(),
//                e.getLicenseTypeId().getLicenseTypeId(),
//                e.getLicenseTypeId().getLicenseType(),
//                e.getLicenseNumber(),
//                e.getIssueDate(),
//                e.getExpiryDate(),
//                e.getIsActive()
//        );
//    }
//}