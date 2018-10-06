package com.thinkpro.account.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.thinkpro.account.domain.Account;

public interface AccountRepository extends JpaRepository<Account, String>{

}
