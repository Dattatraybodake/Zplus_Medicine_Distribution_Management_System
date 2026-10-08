package com.deesha.medicine_distribution.repository;

import com.deesha.medicine_distribution.model.Company;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CompanyRepository extends JpaRepository<Company, Integer> {
}
