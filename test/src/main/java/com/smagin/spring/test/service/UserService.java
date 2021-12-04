package com.smagin.spring.test.service;

import com.smagin.spring.test.model.Customer;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface UserService {
    List<Customer> getAllUsers();
    List<Customer> getAllByNameContains(String name);
    Long getCountByName(String name);
}
