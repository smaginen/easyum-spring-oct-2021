package com.easyum.intro.bankapp.repository;

import com.easyum.intro.bankapp.model.Account;
import com.easyum.intro.bankapp.model.Amount;

public interface TransferRepository {
	
	void transfer(Account accountA, Account accountB, Amount amount);
}
