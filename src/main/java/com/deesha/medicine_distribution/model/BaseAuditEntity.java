package com.deesha.medicine_distribution.model;

import jakarta.persistence.Column;
import jakarta.persistence.MappedSuperclass;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@MappedSuperclass
public abstract class BaseAuditEntity {

    @Column(name = "is_active", nullable = false)
    private Boolean isActive = true;

    @Column(name = "created_by", nullable = false, updatable = false, length = 100)
    private String createdBy;

    @Column(name = "created_at", nullable = false, updatable = false)
    private LocalDateTime createdAt;

    @Column(name = "modified_by", length = 100)
    private String modifiedBy;

    @Column(name = "modified_at")
    private LocalDateTime modifiedAt;

    @Column(name = "deleted_by", length = 100)
    private String deletedBy;

    @Column(name = "deleted_at")
    private LocalDateTime deletedAt;
}