package com.deesha.medicine_distribution.serviceImpl;

import com.deesha.medicine_distribution.dto.LoginRequest;
import com.deesha.medicine_distribution.dto.LoginResponse;
import com.deesha.medicine_distribution.model.UserModel;
import com.deesha.medicine_distribution.repository.UserRepository;
import com.deesha.medicine_distribution.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
<<<<<<< HEAD
=======

>>>>>>> origin/master
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

<<<<<<< HEAD
=======
    @Override
    public void deleteUser(int userid) {

    }

>>>>>>> origin/master
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
<<<<<<< HEAD
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
=======

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
>>>>>>> origin/master
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
<<<<<<< HEAD
        return loginResponse;
    }

}
=======
        return loginresponse;
    }
}
>>>>>>> origin/master
