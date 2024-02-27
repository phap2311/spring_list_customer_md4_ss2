package com.example.spring_customer.service;

import com.example.spring_customer.models.Customer;

import java.util.ArrayList;
import java.util.List;

public class CustomerService implements ICustomerService {
    @Override
    public List<Customer> findAll() {
        List<Customer> customerList = new ArrayList<>();
        customerList.add(new Customer(1L, "van dat", "dat@gg", "ha tinh"));
        customerList.add(new Customer(2L, "van nhat", "nhat@gg", "ha nam"));
        customerList.add(new Customer(3L, "van dung", "dung@gg", "ha tay"));
        customerList.add(new Customer(4L, "van phap", "phap@gg", "ha noi"));
        return customerList;
    }

    @Override
    public Customer findById(Long id) {
        List<Customer> customerList = new ArrayList<>();
        for (Customer customer : customerList) {
            if (customer.getId() == id) {
                return customer;
            }
        }
        return null;
    }

    @Override
    public void save(Customer customer) {
        Customer customer1 = findById(customer.getId());
        customer1.setNameCustomer(customer.getNameCustomer());
        customer1.setEmail(customer.getEmail());
        customer1.setAddress(customer.getAddress());

    }
}

