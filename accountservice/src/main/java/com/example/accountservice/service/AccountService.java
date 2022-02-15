package com.example.accountservice.service;

import com.example.accountservice.model.Account;
import com.example.accountservice.repo.AccountRepo;
import com.netflix.discovery.converters.Auto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountService {
    @Autowired
   private  AccountRepo accountRepo;

    public List<Account> getAccounts(){
        return accountRepo.findAll();
    }

    public Account createAccount(Account account){
        return accountRepo.save(account);
    }
}
