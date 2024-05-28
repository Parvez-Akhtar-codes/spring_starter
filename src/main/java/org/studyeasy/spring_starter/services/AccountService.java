package org.studyeasy.spring_starter.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.studyeasy.spring_starter.Models.Account;
import org.studyeasy.spring_starter.repositories.AccountRepository;

@Service
public class AccountService {

    
    @Autowired
     private AccountRepository accountRepository;

     public Account save(Account account){
        return accountRepository.save(account);
     }
}
