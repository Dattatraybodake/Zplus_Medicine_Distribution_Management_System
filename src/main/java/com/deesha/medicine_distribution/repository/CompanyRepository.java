package com.deesha.medicine_distribution.repository;


import com.deesha.medicine_distribution.model.CompanyModel;
import org.springframework.data.jpa.repository.JpaRepository;


public interface CompanyRepository extends JpaRepository<CompanyModel, Integer> {
}
