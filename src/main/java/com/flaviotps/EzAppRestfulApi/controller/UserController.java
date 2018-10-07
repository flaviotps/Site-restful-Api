package com.flaviotps.EzAppRestfulApi.controller;

import com.flaviotps.EzAppRestfulApi.model.UserModel;
import com.flaviotps.EzAppRestfulApi.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class UserController {

    @Autowired
    UserService userService;


    @GetMapping("/users")
    public List<UserModel> getAllUsers() {
        return userService.findAll();
    }

    @GetMapping("/users/{id}")
    public UserModel getUserById(@PathVariable("id") long id) {
        return userService.findById(id);
    }

    @PostMapping("/users")
    public void createUser(@RequestBody UserModel user) {
        userService.save(user);
    }

    @PutMapping("/users")
    public void updateUser(@RequestBody UserModel user) {
        userService.save(user);
    }

    @DeleteMapping("/users/{id}")
    public void deleteUserById(@PathVariable("id") long id) {
        userService.deleteById(id);
    }


}
