package com.deesha.medicine_distribution.serviceImpl;

import com.deesha.medicine_distribution.dto.LoginRequest;
import com.deesha.medicine_distribution.dto.LoginResponse;
import com.deesha.medicine_distribution.model.UserModel;
import com.deesha.medicine_distribution.repository.UserRepository;
import com.deesha.medicine_distribution.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepository userRepository;

    @Override
    public boolean saveUsers(UserModel usermodel) {

        return userRepository.save(usermodel)!=null;
    }

    @Override
    public List<UserModel> viewAllUsers() {
        System.out.println("Called get All Employees ");
        return userRepository.findAll();
    }

    @Override
    public LoginResponse login(LoginRequest loginRequest) {
        LoginResponse loginResponse = new LoginResponse();

        try{
            UserModel usermodel = userRepository.findByEmail(loginRequest.getEmail());

            if(usermodel == null)
            {
                loginResponse.setFlag(false);
                loginResponse.setMessage("User Model Not Found");
                return loginResponse;
            }

            if (usermodel.getEmail().equalsIgnoreCase(loginRequest.getEmail()))
            {
                loginResponse.setFlag(true);
                loginResponse.setMessage("Login SuccessFull");
            }

            else {

                loginResponse.setFlag(false);
                loginResponse.setMessage("Password is not correct");
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return loginResponse;
    }

}