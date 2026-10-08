//package com.deesha.medicine_distribution.serviceImpl;
//
//import com.deesha.medicine_distribution.model.CompanyLicenseType;
//import com.deesha.medicine_distribution.repository.CompanyLicenseTypeRepository;
//import com.deesha.medicine_distribution.service.CompanyLicenseTypeService;
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
//public class CompanyLicenseTypeServiceImpl implements CompanyLicenseTypeService {
//
//    private final CompanyLicenseTypeRepository repository;
//
//    @Override
//    public CompanyLicenseType create(CompanyLicenseType companyLicenseType) {
//        if (repository.existsByLicenseType(companyLicenseType.getLicenseType())) {
//            throw new ResponseStatusException(HttpStatus.CONFLICT,
//                    "License type already exists: " + companyLicenseType.getLicenseType());
//        }
//        companyLicenseType.setLicenseTypeId(null); // force INSERT
//        if (companyLicenseType.getIsActive() == null) {
//            companyLicenseType.setIsActive(false);
//        }
//        return repository.save(companyLicenseType);
//    }
//
//    @Override
//    @Transactional(readOnly = true)
//    public List<CompanyLicenseType> getAll() {
//        return repository.findAll();
//    }
//
//    @Override
//    @Transactional(readOnly = true)
//    public CompanyLicenseType getById(Long id) {
//        return repository.findById(id)
//                .orElseThrow(() -> new ResponseStatusException(
//                        HttpStatus.NOT_FOUND, "CompanyLicenseType not found with id: " + id));
//    }
//
//    @Override
//    public CompanyLicenseType update(Long id, CompanyLicenseType companyLicenseType) {
//        CompanyLicenseType existing = getById(id);
//
//        if (repository.existsByLicenseTypeAndLicenseTypeIdNot(companyLicenseType.getLicenseType(), id)) {
//            throw new ResponseStatusException(HttpStatus.CONFLICT,
//                    "License type already exists: " + companyLicenseType.getLicenseType());
//        }
//
//        existing.setLicenseType(companyLicenseType.getLicenseType());
//        if (companyLicenseType.getIsActive() != null) {
//            existing.setIsActive(companyLicenseType.getIsActive());
//        }
//        return repository.save(existing);
//    }
//
//    @Override
//    public void delete(Long id) {
//        repository.delete(getById(id));
//    }
//}