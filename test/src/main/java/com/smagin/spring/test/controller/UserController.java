package com.smagin.spring.test.controller;

import com.smagin.spring.test.model.Customer;
import com.smagin.spring.test.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Slf4j
public class UserController {
    private UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/users")
    public List<Customer> getUsers(){
        log.info("Getting users ....");
        return userService.getAllUsers();
    }

        @GetMapping("/customers")
    public List<Customer> getUsersByName(@RequestParam("name") String name){
        return userService.getAllByNameContains(name);
    }


    @GetMapping("/count")
    public Long getCountByName(@RequestParam("name") String name){
        return userService.getCountByName(name);
    }

}
