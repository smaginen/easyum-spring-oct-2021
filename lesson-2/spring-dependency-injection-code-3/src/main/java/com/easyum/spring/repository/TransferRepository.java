package com.easyum.spring.repository;

import com.easyum.spring.model.Account;
import com.easyum.spring.model.Amount;

public interface TransferRepository {
	
	void transfer(Account accountA, Account accountB, Amount amount);
}
