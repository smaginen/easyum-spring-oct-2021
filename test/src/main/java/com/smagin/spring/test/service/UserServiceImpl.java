package com.smagin.spring.test.service;

import com.smagin.spring.test.model.Customer;
import com.smagin.spring.test.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    private UserRepository repository;

    @Autowired
    public UserServiceImpl(UserRepository repository) {
        this.repository =  repository;
    }

    @Override
    public List<Customer> getAllUsers() {
        return repository.findAll();
    }

    @Override
    public List<Customer> getAllByNameContains(String name) {
        return repository.getAllByNameContains(name);
    }

    @Override
    public Long getCountByName(String name) {
        return repository.getCountByName(name);
    }
}
