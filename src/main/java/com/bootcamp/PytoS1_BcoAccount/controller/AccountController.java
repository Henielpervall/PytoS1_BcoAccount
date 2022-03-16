package com.bootcamp.PytoS1_BcoAccount.controller;


import com.bootcamp.PytoS1_BcoAccount.model.Account;
import com.bootcamp.PytoS1_BcoAccount.service.AccountServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequestMapping("/account")
public class AccountController {

    @Autowired
    private AccountServiceImpl accountServiceImpl;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void addAccount(@RequestBody Account account){
        accountServiceImpl.addAccount(account);
    }

}
