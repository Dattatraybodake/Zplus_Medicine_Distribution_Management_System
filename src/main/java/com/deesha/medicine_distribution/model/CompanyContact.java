package com.deesha.medicine_distribution.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter @Setter
@Table(name = "company_contact")
public class CompanyContact extends BaseAuditEntity{

    public enum ContactType { OWNER, AUTHORIZED_SIGNATORY, GENERAL }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "contact_id")
    private Long contactId;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "company_id", nullable = false)
    private Company company;

    @Enumerated(EnumType.STRING)
    @Column(name="contact_type", nullable = false, length = 25)
    private ContactType contactType;

    @Column(name="contact_number", nullable = false, length = 15)
    private String contactNumber;

    @Column(name="alternate_contact", length = 15)
    private String alternateContact;

    @Column(name="email_id", length = 90)
    private String emailId;
}
