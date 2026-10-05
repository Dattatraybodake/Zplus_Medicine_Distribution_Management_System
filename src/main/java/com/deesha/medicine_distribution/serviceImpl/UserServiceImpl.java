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

    @Override
    public void deleteUser(int userid) {

    }

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

        LoginResponse loginresponse = new LoginResponse();
        try {
            UserModel usermodel = userRepository.findByUserName(loginRequest.getUsername());
            if(usermodel == null)
            {
                loginresponse.setFlag(false);
                loginresponse.setMessage("User Model not found");
                return loginresponse;
            }
            if(usermodel.getUserName().equalsIgnoreCase(loginRequest.getUsername()))
            {
                if(usermodel.getPassword().equalsIgnoreCase(loginRequest.getPassword()))
                {
                    loginresponse.setFlag(true);
                    loginresponse.setMessage("Login SuccessFull");
                }
                else
                {
                    loginresponse.setFlag(false);
                    loginresponse.setMessage("Password is not correct");
                }
            }
            else
            {
                loginresponse.setFlag(false);
                loginresponse.setMessage("Username is not correct");
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return loginresponse;
    }
}
