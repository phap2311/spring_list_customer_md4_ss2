package com.example.spring_customer.service;

import com.example.spring_customer.models.Customer;

import java.util.List;

public interface ICustomerService {
    List<Customer> findAll();

    Customer findById(Long id);

    void save(Customer customer);
}
