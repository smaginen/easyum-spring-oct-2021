package com.easyum.design.facade.pattern;

import com.easyum.design.model.Account;

/**
 *
 *
 */
public class TransferService {

	public static void transfer(int amount, Account fromAccount, Account toAccount) {
		System.out.println("Transfering Money");
	}
}
