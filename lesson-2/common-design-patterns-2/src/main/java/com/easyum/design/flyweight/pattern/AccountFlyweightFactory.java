package com.easyum.design.flyweight.pattern;

import java.util.HashMap;
import java.util.Map;

import com.easyum.design.model.Account;
import com.easyum.design.model.CurrentAccount;
import com.easyum.design.model.SavingAccount;

/**
 *
 *
 */
public class AccountFlyweightFactory {
	private static final Map<String, Account> flyweight = new HashMap<String, Account>();

	   public static Account getAccount(String accountType) {
		   Account account = (Account)flyweight.get(accountType);

	      if(account == null) {
	    	  if("SAVING".equals(accountType)){
	    		  account = new SavingAccount();
	    	  }else if("CURRENT".equals(accountType)){
	    		  account = new CurrentAccount();
	    	  }
	    	  flyweight.put(accountType, account);
	      }
	      return account;
	   }
}
