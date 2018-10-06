package com.thinkpro.account.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.thinkpro.account.domain.Account;
import com.thinkpro.account.repository.AccountRepository;
import com.thinkpro.account.service.AccountService;

@Service
public class AccountServiceImpl implements AccountService {
	
	@Autowired
	private AccountRepository accountRepository;

	@Override
	public String create(Account account) {
		accountRepository.save(account);
		return account.getAccountNumber();
	}

	@Override
	public String update(Account account) {
		accountRepository.save(account);
		return account.getAccountNumber();		
	}

	@Override
	public Account getByAccountNumber(String accountNumber) {
		Account account = accountRepository.getOne(accountNumber);
		
		return account;
	}

}
