package com.easyum.design.abstractfactory.pattern;

import com.easyum.design.model.Account;
import com.easyum.design.model.Bank;

/**
 *
 *
 */
public abstract class AbstractFactory {
	
	abstract Bank getBank(String bankName);
	
	abstract Account getAccount(String accountType);
}
