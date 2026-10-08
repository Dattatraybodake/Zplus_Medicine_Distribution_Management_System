package com.deesha.medicine_distribution.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "company_license_type")
public class CompanyLicenseType extends BaseAuditEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "license_type_id")
    private Long licenseTypeId;

    @Column(name = "license_type", nullable = false, unique = true)
    private String licenseType;

    @Column(name = "is_active", nullable = false)
    private Boolean isActive=false;
}