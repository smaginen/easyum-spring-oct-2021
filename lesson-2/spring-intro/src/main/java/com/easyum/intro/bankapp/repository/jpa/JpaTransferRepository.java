package com.easyum.intro.bankapp.repository.jpa;


import com.easyum.intro.bankapp.model.Account;
import com.easyum.intro.bankapp.model.Amount;
import com.easyum.intro.bankapp.repository.TransferRepository;

public class JpaTransferRepository implements TransferRepository {

	@Override
	public void transfer(Account accountA, Account accountB, Amount amount) {
		System.out.println("Transfering amount from account A to B via JPA implementation");
	}

}
