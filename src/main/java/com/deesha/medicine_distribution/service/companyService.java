package com.deesha.medicine_distribution.service;



import com.deesha.medicine_distribution.model.CompanyModel;

import java.util.List;

public interface companyService {
    public boolean saveCompany(CompanyModel companyModel);
    public List<CompanyModel> viewAllcompanies();
}
