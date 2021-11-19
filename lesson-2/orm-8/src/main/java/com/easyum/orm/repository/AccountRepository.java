/**
 * 
 */
package com.easyum.orm.repository;

import java.util.List;

import com.easyum.orm.model.Account;

/**
 *
 *
 */
public interface AccountRepository {
	
	Account findAccountById(Long id);
	
	List<Account> findAll();
	
	Long save(Account account);
	
	Double checkAccountBalance(Account account);
}
