package com.easyum.spring.repository.jdbc;

import org.springframework.stereotype.Repository;

import com.easyum.spring.model.Account;
import com.easyum.spring.model.Amount;
import com.easyum.spring.repository.TransferRepository;
@Repository
public class JdbcTransferRepository implements TransferRepository {

	@Override
	public void transfer(Account accountA, Account accountB, Amount amount) {
		System.out.println("Transfering amount from account A to B via JDBC implementation");
	}

}
