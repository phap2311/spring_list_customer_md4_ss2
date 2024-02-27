package com.example.spring_customer.models;

public class Customer {
    private  Long id ;
    private  String nameCustomer;
    private  String email;
    private String address;

    public Customer() {
    }

    public Customer(Long id, String nameCustomer, String email, String address) {
        this.id = id;
        this.nameCustomer = nameCustomer;
        this.email = email;
        this.address = address;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNameCustomer() {
        return nameCustomer;
    }

    public void setNameCustomer(String nameCustomer) {
        this.nameCustomer = nameCustomer;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
