package com.bootcamp.PytoS1_BcoAccount.service;

import com.bootcamp.PytoS1_BcoAccount.model.Account;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface AccountServiceInterface {

    void addAccount(Account account);

    Mono<Account> findAccountById(Integer id);

    Flux<Account> findAllAccount();

    Mono<Account> updateAccount(Account account);

    Mono<Void> deleteAccount(Integer id);
}
