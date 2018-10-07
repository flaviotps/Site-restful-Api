package com.flaviotps.EzAppRestfulApi.service;

import com.flaviotps.EzAppRestfulApi.model.AppModel;
import com.flaviotps.EzAppRestfulApi.model.UserModel;
import com.flaviotps.EzAppRestfulApi.repository.AppRepository;
import com.flaviotps.EzAppRestfulApi.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class AppService {

    @Autowired
    AppRepository appRepository;

    @Autowired
    UserRepository userRepository;

    public List<AppModel> findAll() {
        return appRepository.findAll();
    }

    public void save(AppModel app, long userId) {

        UserModel user = userRepository.findById(userId);
        user.getApps().add(app);
        userRepository.save(user);
    }

    public AppModel findById(long id) {
        return appRepository.findById(id);
    }

    public void deleteById(long id) {
        appRepository.deleteById(id);
    }


}
