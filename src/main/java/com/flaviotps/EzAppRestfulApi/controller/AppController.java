package com.flaviotps.EzAppRestfulApi.controller;


import com.flaviotps.EzAppRestfulApi.model.AppModel;
import com.flaviotps.EzAppRestfulApi.service.AppService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AppController {

    @Autowired
    AppService appService;


    @PostMapping("/apps/{userId}")
    public void createApp(@RequestBody AppModel app, @PathVariable long userId) {
        appService.save(app, userId);
    }

    @GetMapping("/apps")
    public List<AppModel> getAppList() {
        return appService.findAll();
    }

    @GetMapping("/apps/{id}")
    public AppModel getAllByUserId(@PathVariable("id") long id) {
        return appService.findById(id);
    }

    @DeleteMapping("/apps/{id}")
    public void deleteUserById(@PathVariable("id") long id) {
        appService.deleteById(id);
    }


}
