package com.deesha.medicine_distribution.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Pattern;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter @Setter
@Table(name = "company_bank_account")
public class CompanyBankAccount extends BaseAuditEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="bank_account_id")
    private Long bankAccountId;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "company_id", nullable = false)
    private Company company;

    @Column(name = "bank_name", nullable=false, length = 90)
    private String bankName;

    @Column(name = "bank_account_name", nullable = false, length = 90)
    private String accountName;

    @Column(name = "bank_account_number", unique = true, nullable = false)
    @Pattern(regexp = "^[0-9]{9,18}$")
    private String accountnumber;

    @Column(name = "ifsc_code", nullable = false, unique = true, length = 11)
    @Pattern(regexp = "^[A-Z]{4}0[A-Z0-9]{6}$")
    private String ifscCode;

    @Column(name = "branch_name", length = 90)
    private String branchName;

    @Column(name = "is_Active", nullable = false)
    private Boolean isActive = false;
}