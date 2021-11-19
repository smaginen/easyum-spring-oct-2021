package com.easyum.intro.bankapp.repository.jdbc;


import com.easyum.intro.bankapp.model.Account;
import com.easyum.intro.bankapp.model.Amount;
import com.easyum.intro.bankapp.repository.AccountRepository;

public class JdbcAccountRepository implements AccountRepository {

	@Override
	public Account findByAccountId(Long accountId) {
		return new Account(accountId, "Arnav Rajput", new Amount(3000.0));
	}

}
