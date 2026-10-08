package com.deesha.medicine_distribution.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="company_model")
public class CompanyModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String companyName;

    private String cinNumber;

    private String companyTradeName;

    private String manufacturingLicenseNumber;

    private String gstIn;

    private Date drugLicenseExpriryDate;

    private Date companyStartDate;

    private String udyamRegNumber;

    private String panNumber;

    private String enterpricesType;

    private String companyOwner;

    private String ownerContact;

    private String alternateContact;

    private String registerAddress1;

    private String registerAddress2;

    private String city;

    private String district;

    private String state;

    private String country;

    private int pincode;

    private String authorized_signatory_name;

    private String contactNumber;

    private String getAlternateContact;

    private String email;

    private String companyWebsite;

    private int isActive;
}
