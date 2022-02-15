package com.example.customer.controller;

import com.example.customer.model.Account;
import com.example.customer.model.Customer;


import com.example.customer.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.Objects;

@RestController
@RequestMapping("/DashBoard")
public class CustomerController {

    @Autowired
    CustomerService customerService;

    @Autowired
    RestTemplate restTemplate;

    @GetMapping("/CustomerDetails")
    public List<Customer> getCustomerdetails()
    {

        return  customerService.getCustomerdetails();
    }

    @PostMapping("/AddingCustomer")
    public Customer addCustomer(@RequestBody Customer customer)
    {
        return customerService.addCustomer(customer);

    }
    @GetMapping("/accounts")
    public Account showAccounts(){
        return  restTemplate.exchange("http://localhost:8082/accounts", HttpMethod.GET, null, new ParameterizedTypeReference<Account>() {}).getBody();
        }

}
