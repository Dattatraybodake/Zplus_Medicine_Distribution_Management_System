package com.deesha.medicine_distribution.model;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Getter @Setter
@Table(name = "company_address", uniqueConstraints = @UniqueConstraint(name = "uq_company_address_type", columnNames = {"company_id", "address_type"}))
public class CompanyAddress extends BaseAuditEntity {

    public enum AddressType { REGISTERED, FACTORY, CORRESPONDENCE }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "address_id")
    private Long addressId;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "company_id", nullable = false)
    private Company company;

    @Enumerated(EnumType.STRING)
    @Column(name = "address_type", nullable = false, length = 20)
    private AddressType addressType;

    @Column(name = "address_line1", nullable = false)
    private String addressLine1;

    @Column(name = "address_line2")
    private String addressLine2;

    @Column(name = "city", nullable = false, length = 90)
    private String city;

    @Column(name = "district", nullable = false)
    private String district;

    @Column(name = "state", nullable = false)
    private String state;

    @Column(name = "country", nullable = false)
    private String country;

    @Column(name = "pincode", nullable = false)
    private int pincode;
}