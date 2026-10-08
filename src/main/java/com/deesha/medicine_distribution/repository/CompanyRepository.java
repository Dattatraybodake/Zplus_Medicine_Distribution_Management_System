package com.deesha.medicine_distribution.repository;

<<<<<<< HEAD
import com.deesha.medicine_distribution.model.Company;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CompanyRepository extends JpaRepository<Company, Integer> {
=======

import com.deesha.medicine_distribution.model.CompanyModel;
import org.springframework.data.jpa.repository.JpaRepository;


public interface CompanyRepository extends JpaRepository<CompanyModel, Integer> {
>>>>>>> origin/master
}
