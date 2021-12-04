package com.smagin.spring.test.repository;

import com.smagin.spring.test.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface UserRepository extends JpaRepository<Customer, Long> {
    List<Customer> getAllByNameContains(String name);

    @Query("select count(*) from Customer where name =:name")
    Long getCountByName(@Param("name") String name);
}
