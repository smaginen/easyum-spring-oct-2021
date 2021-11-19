package com.easyum.intro.bankapp.repository;


import com.easyum.intro.bankapp.model.Account;

public interface AccountRepository {
	
	Account findByAccountId(Long accountId);
}
