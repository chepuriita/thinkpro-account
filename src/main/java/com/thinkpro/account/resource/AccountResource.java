package com.thinkpro.account.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.thinkpro.account.domain.Account;
import com.thinkpro.account.service.AccountService;

@RestController
@RequestMapping("/")
public class AccountResource {

	@Autowired
	private AccountService accountService;

	@GetMapping(path = "get/{accountNumber}", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Account> getAccount(@PathVariable("accountNumber") String accountNumber) {
		System.out.println("accountNumber ----->:" + accountNumber);
		Account account = accountService.getByAccountNumber(accountNumber);
		HttpHeaders headers = new HttpHeaders();
		headers.add("Responded", "AccountResource");
		return ResponseEntity.accepted().headers(headers).body(account);
	}

	@PostMapping(value = "create", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	public  ResponseEntity<String> createAccount(@RequestBody Account account) {
		System.out.println("accountNumber ----->:" + account.getAccountNumber());
		 accountService.create(account);		
		return ResponseEntity.status(HttpStatus.CREATED).build();
		
	}

	@PutMapping(value = "update", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<String> updateAccount(@RequestBody Account account) {
		System.out.println("accountNumber ----->:" + account.getAccountNumber());
		accountService.update(account);
		return ResponseEntity.status(HttpStatus.ACCEPTED).build();
	}

}
