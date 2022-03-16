package com.bootcamp.PytoS1_BcoAccount.dao;

import com.bootcamp.PytoS1_BcoAccount.model.Account;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountRepository extends ReactiveMongoRepository<Account, Integer> {
}
