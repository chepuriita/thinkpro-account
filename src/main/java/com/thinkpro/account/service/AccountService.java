package com.thinkpro.account.service;

import com.thinkpro.account.domain.Account;


public interface AccountService {
	public String create(Account account);
	public String update(Account account);
	public Account getByAccountNumber(String accountNumber);
	
}
