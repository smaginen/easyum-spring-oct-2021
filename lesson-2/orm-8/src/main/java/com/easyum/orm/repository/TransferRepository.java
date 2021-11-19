/**
 * 
 */
package com.easyum.orm.repository;

import com.easyum.orm.model.Account;

/**
 *
 *
 */
public interface TransferRepository {
	
	void tranfer(Long amount, Account account);
}
