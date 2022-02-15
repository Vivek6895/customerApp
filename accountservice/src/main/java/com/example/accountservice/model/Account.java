package com.example.accountservice.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="accounts")
@Data
public class Account {
    @Id
    private int id;
    private int accNumber;
    private String accType;

}
