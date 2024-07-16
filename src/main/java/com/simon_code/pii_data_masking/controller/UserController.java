package com.simon_code.pii_data_masking.controller;

import com.simon_code.pii_data_masking.dto.User;
import com.simon_code.pii_data_masking.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/")
public class UserController {
    @Autowired
    private UserService userService;
    @GetMapping("getAllUser")
    public List<User> getAllUser(){
        return  userService.getAllUser();
    }
    @GetMapping("getUserById/{id}")
    public User getUser(@PathVariable int id){
        return userService.getUser(id);
    }

}
