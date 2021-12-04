package com.easyum.jdbc.repository;

import com.easyum.jdbc.model.Account;

/**
 *
 *
 */
public interface TransferRepository {
	
	void tranfer(Long amount, Account account);
}
