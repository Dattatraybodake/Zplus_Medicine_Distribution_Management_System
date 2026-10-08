//package com.deesha.medicine_distribution.serviceImpl;
//
//import com.deesha.medicine_distribution.model.Company;
//import com.deesha.medicine_distribution.repository.CompanyRepository;
//import com.deesha.medicine_distribution.service.companyService;
//import org.springframework.stereotype.Service;
//
//import java.util.List;
//
//@Service
//public class CompanyServiceImpl implements companyService {
//
//   private final CompanyRepository companyRepository;
//
//    public CompanyServiceImpl(CompanyRepository companyRepository) {
//        this.companyRepository = companyRepository;
//    }
//
//
//    @Override
//    public boolean saveCompany(Company company) {
//        return companyRepository.save(company)!=null?true:false;
//    }
//
//    @Override
//    public List<Company> viewAllcompanies() {
//        return companyRepository.findAll();
//    }
//}
