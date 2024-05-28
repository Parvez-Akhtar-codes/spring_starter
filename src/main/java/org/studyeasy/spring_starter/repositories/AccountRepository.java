package org.studyeasy.spring_starter.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.studyeasy.spring_starter.Models.Account;


public interface AccountRepository extends JpaRepository<Account ,Long> {


    
} 
