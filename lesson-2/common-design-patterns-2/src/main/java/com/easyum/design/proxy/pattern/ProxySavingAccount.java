package com.easyum.design.proxy.pattern;

import com.easyum.design.model.Account;
import com.easyum.design.model.SavingAccount;

/**
 *
 *
 */
public class ProxySavingAccount implements Account{
	
	private Account savingAccount;
	
	@Override
	public void accountType() {
		if(savingAccount == null){
			savingAccount = new SavingAccount();
		}
		savingAccount.accountType();
	}

}
