package com.easyum.spring.repository;

import com.easyum.spring.model.Account;

public interface AccountRepository {
	
	Account findByAccountId(Long accountId);
}
