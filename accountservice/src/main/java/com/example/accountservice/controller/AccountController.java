package com.example.accountservice.controller;

import com.example.accountservice.model.Account;
import com.example.accountservice.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AccountController {
    @Autowired
    private AccountService accountService;

    @GetMapping("/accounts")
    public List<Account> getAccounts(){
        return accountService.getAccounts();
    }

    @PostMapping("/create")
    public String Create(@RequestBody Account account){
        Account acc=accountService.createAccount(account);
        System.out.println(acc);
        return "Account Created";
    }
}
