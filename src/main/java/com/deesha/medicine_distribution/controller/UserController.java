package com.deesha.medicine_distribution.controller;

import com.deesha.medicine_distribution.dto.LoginRequest;
import com.deesha.medicine_distribution.dto.LoginResponse;
import com.deesha.medicine_distribution.model.UserModel;
import com.deesha.medicine_distribution.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    Logger logger= LoggerFactory.getLogger(UserController.class);

    @Autowired
    private UserService userService;

    @PostMapping("/save")
    public ResponseEntity registerUser(@RequestBody UserModel usermodel)
    {
        boolean saved = userService.saveUsers(usermodel);
        {
            if(saved)
            {
                return new ResponseEntity<>(saved, HttpStatus.CREATED);
            }
            else {
                return new ResponseEntity(saved, HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }
    }

    @GetMapping
    public String testing()
    {
        return "Testing";
    }

    @GetMapping("/{test}")
    public String testing(@PathVariable("test") String test)
    {
        return test;
    }

    @GetMapping("/Viewuser")
    public List<UserModel> getAllUsers() throws Exception
    {
//        return userService.viewAllUsers();
        List<UserModel> list = userService.viewAllUsers();
        if(list.size()!=0)
        {
            System.out.println("  list ="+list.size());
<<<<<<< HEAD
//            ret   urn new ResponseEntity<>(list, HttpStatus.OK);
=======
//            return new ResponseEntity<>(list, HttpStatus.OK);
>>>>>>> origin/master
            return userService.viewAllUsers();
        }
        else
        {
            throw new RuntimeException("There is No data In Database");
        }
    }

    @PostMapping("/login")
    public ResponseEntity<LoginResponse> login(@RequestBody LoginRequest loginRequest)
    {
        LoginResponse loginresponse = userService.login(loginRequest);
        return ResponseEntity.ok(loginresponse);
    }
}