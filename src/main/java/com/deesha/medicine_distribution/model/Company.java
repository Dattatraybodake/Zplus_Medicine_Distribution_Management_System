package com.deesha.medicine_distribution.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter @Setter
@Table(name = "company")
public class Company extends BaseAuditEntity {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(name = "company_id")
        private Integer companyId;

        @Column(name = "company_name", nullable = false, length = 255)
        private String companyName;

        @Column(name = "company_tradename", length = 200)
        private String companyTradeName;

        @ManyToOne(fetch = FetchType.LAZY)
        @JoinColumn(name = "enterprise_type")
        private EnterpriseType enterprise;

        @ManyToOne(fetch = FetchType.LAZY)
        @JoinColumn(name = "parent_company_id")
        private Company parentCompany;

        @Column(name = "company_start_date", nullable = false)
        private LocalDate companyStartDate;

        @Column(name = "company_end_date")
        private LocalDate companyEndDate;

        @Column(name = "website")
        private String website;

        @OneToMany(mappedBy = "company", cascade = CascadeType.ALL, orphanRemoval = true)
        private List<CompanyLicense> licenses = new ArrayList<>();

        @OneToMany(mappedBy = "company", cascade = CascadeType.ALL,orphanRemoval = true)
        private List<CompanyAddress> address = new ArrayList<>();

        @OneToMany(mappedBy = "company", cascade = CascadeType.ALL, orphanRemoval = true)
        private List<CompanyBankAccount> bankAccounts = new ArrayList<>();

        @OneToMany(mappedBy = "company", cascade = CascadeType.ALL, orphanRemoval = true)
        private List<CompanyContact> contacts = new ArrayList<>();
}