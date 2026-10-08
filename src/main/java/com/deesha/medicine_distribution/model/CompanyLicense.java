package com.deesha.medicine_distribution.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import java.time.LocalDate;

@Entity
@Getter
@Setter
@Table(name = "company_license")
public class CompanyLicense extends BaseAuditEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="license_id")
    private Long licenseId;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "company_id", nullable = false)
    private Company company;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)    // check and correct if any wrong.
    @JoinColumn(name = "license_type_id", nullable = false)     // check and correct if any wrong.
    private CompanyLicenseType licenseTypeId;

    @Column(name = "license_number")
    private String licenseNumber;

    @Column(name = "issue_date")
    private LocalDate issueDate;

    @Column(name = "expiry_date")
    private LocalDate expiryDate;

    @Column(name = "is_active")
    private Boolean isActive;
}