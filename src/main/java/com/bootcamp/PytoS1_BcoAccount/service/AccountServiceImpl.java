package com.bootcamp.PytoS1_BcoAccount.service;

import com.bootcamp.PytoS1_BcoAccount.dao.AccountRepository;
import com.bootcamp.PytoS1_BcoAccount.model.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class AccountServiceImpl implements AccountServiceInterface {

    @Autowired
    AccountRepository accountRepository;

    @Override
    public void addAccount(Account account) {
        accountRepository.save(account).subscribe();
    }

    @Override
    public Mono<Account> findAccountById(Integer id) {
        return accountRepository.findById(id);
    }

    @Override
    public Flux<Account> findAllAccount() {
        return accountRepository.findAll();
    }

    @Override
    public Mono<Account> updateAccount(Account account) {
        return accountRepository.save(account);
    }

    @Override
    public Mono<Void> deleteAccount(Integer id) {
        return accountRepository.deleteById(id);
    }
}
