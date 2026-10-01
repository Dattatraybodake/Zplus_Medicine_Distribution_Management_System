package com.deesha.medicine_distribution.controller;

import com.deesha.medicine_distribution.model.CompanyModel;
import com.deesha.medicine_distribution.service.companyService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CompanyController {
    Logger logger = LoggerFactory.getLogger(CompanyController.class);

    @Autowired
    companyService companyservice;

    @PostMapping("/savecompany")
    public String saveCompany(@RequestParam CompanyModel companymodel)
    {
        boolean saved = companyservice.saveCompany(companymodel);
        if(saved)
        {
            return "Company Data Saved Successfully in Database.";
        }
        else {
            return "Problem Occur in saved company Data.";
        }
    }

    @GetMapping("/getAllcompnies")
    public List<CompanyModel> getAllCompanies()
    {
        return companyservice.viewAllcompanies();
    }
}
