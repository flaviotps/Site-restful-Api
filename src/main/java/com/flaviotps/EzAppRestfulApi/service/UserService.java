package com.flaviotps.EzAppRestfulApi.service;


import com.flaviotps.EzAppRestfulApi.model.UserModel;
import com.flaviotps.EzAppRestfulApi.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class UserService {


    @Autowired
    UserRepository userRepository;


    public List<UserModel> findAll() {
        return userRepository.findAll();
    }

    public void save(UserModel user) {
        user.setJoinDate(new Date());
        userRepository.save(user);
    }

    public UserModel findById(long id) {
        return userRepository.findById(id);
    }

    public void deleteById(long id) {
        userRepository.deleteById(id);
    }

}
