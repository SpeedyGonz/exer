package com.javaex.springboot.springbootcrudrestfulwebservices.controller;

import com.javaex.springboot.springbootcrudrestfulwebservices.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.javaex.springboot.springbootcrudrestfulwebservices.model.User;
import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class UserController {

    @Autowired
    private UserRepository userRepository;

    //create get all users api
    @GetMapping("/users")
    public List<User> getAllUsers(){
         return userRepository.findAll();
    }

     @PostMapping("/users")
     public User createUser (@RequestBody User user){
        return userRepository.save(user);
     }

}
