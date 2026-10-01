package com.deesha.medicine_distribution.repository;


import com.deesha.medicine_distribution.model.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UserRepository extends JpaRepository<UserModel, Integer> {
    UserModel findByUserName(String userName);
}
