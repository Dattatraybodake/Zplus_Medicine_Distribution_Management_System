package com.deesha.medicine_distribution.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter @Setter
@Table(name="enterprice_type")
public class EnterpriseType extends BaseAuditEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="enterprise_type_id")
    private Integer enterpriseTypeId;

    @Column(name="enterprice_type")
    private String enterpriseType;

    @Column(name="is_active", nullable = false)
    private boolean isActive=true;
}