package com.example.customer.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
@Getter
@Setter
public class Account {
    @Id
    private int id;
    private int accNumber;
    private String accType;
}