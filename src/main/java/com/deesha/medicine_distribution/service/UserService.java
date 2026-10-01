package com.deesha.medicine_distribution.service;



import com.deesha.medicine_distribution.dto.LoginRequest;
import com.deesha.medicine_distribution.dto.LoginResponse;
import com.deesha.medicine_distribution.model.UserModel;

import java.util.List;

public interface UserService {
    boolean saveUsers(UserModel usermodel);
    List<UserModel> viewAllUsers();

    LoginResponse login(LoginRequest loginRequest);
}