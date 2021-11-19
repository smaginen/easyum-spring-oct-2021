package com.easyum.spring.repository.jdbc;

import org.springframework.stereotype.Repository;

import com.easyum.spring.model.Account;
import com.easyum.spring.model.Amount;
import com.easyum.spring.repository.AccountRepository;

@Repository
public class JdbcAccountRepository implements AccountRepository {

	@Override
	public Account findByAccountId(Long accountId) {
		return new Account(accountId, "Arnav Rajput", new Amount(3000.0));
	}

}
