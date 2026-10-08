package com.deesha.medicine_distribution.repository;

<<<<<<< HEAD
import com.deesha.medicine_distribution.model.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<UserModel, Integer> {
    UserModel findByEmail(String email);
=======

import com.deesha.medicine_distribution.model.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UserRepository extends JpaRepository<UserModel, Integer> {
    UserModel findByUserName(String userName);
>>>>>>> origin/master
}
