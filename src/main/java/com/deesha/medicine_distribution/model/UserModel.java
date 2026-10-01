package com.deesha.medicine_distribution.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Entity
@NoArgsConstructor
@Getter
@Setter
@ToString
public class UserModel {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Integer userId;


    private String userName;


    private String fullName;


    private String email;


    private String contactNumber;


    private String password;


    private String isActive;


    @JsonFormat(pattern = "dd-MM-yyyy")
    private LocalDate lastLogin;


}