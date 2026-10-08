package com.deesha.medicine_distribution.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
<<<<<<< HEAD
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "roles")
=======
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
>>>>>>> origin/master
public class Role {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "role_id")
    private Integer roleId;

    @Column(name = "role_name", nullable = false, unique = true)
<<<<<<< HEAD
    private String role;

    @Column(name = "is_active", nullable = false)
    public Boolean isActive=true;
=======
    private String Role;

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    public String getRole() {
        return Role;
    }

    public void setRole(String role) {
        Role = role;
    }
>>>>>>> origin/master
}
