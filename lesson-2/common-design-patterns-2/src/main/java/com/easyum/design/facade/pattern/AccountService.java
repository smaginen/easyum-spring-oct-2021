package com.easyum.design.facade.pattern;

import com.easyum.design.model.Account;
import com.easyum.design.model.SavingAccount;

/**
 *
 *
 */
public class AccountService {

	public static Account getAccount(String accountId) {
		return new SavingAccount();
	}
}
