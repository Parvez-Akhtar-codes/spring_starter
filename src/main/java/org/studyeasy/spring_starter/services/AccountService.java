package org.studyeasy.spring_starter.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.studyeasy.spring_starter.Models.Account;
import org.studyeasy.spring_starter.repositories.AccountRepository;

@Service
public class AccountService {

    
    @Autowired
     private AccountRepository accountRepository;

     @Autowired
     private PasswordEncoder passwordEncoder;

     public Account save(Account account){
      account.setPassword(passwordEncoder.encode(account.getPassword()));
        return accountRepository.save(account);
     }
}
