package com.example.customer.service;

import com.example.customer.model.Customer;


import com.example.customer.repo.Repo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService
{
    @Autowired
    Repo customerRepo;


    public List<Customer> getCustomerdetails(){
        return (List<Customer>) customerRepo.findAll();
    }

    public Customer addCustomer( Customer customer)
    {
        Customer customer1 = customerRepo.save(customer);
        return customer1;

    }

}