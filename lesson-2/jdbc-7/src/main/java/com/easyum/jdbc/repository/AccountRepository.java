package com.easyum.jdbc.repository;

import java.io.Writer;
import java.util.List;

import com.easyum.jdbc.model.Account;

/**
 *
 *
 */
public interface AccountRepository {
	Account findAccountById(Long id);
	void generateReport(Writer out, String city);
	List<Account> extractAccounts();
}
