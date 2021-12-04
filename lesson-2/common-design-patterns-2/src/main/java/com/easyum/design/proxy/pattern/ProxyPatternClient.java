package com.easyum.design.proxy.pattern;

import com.easyum.design.model.Account;

/**
 *
 *
 */
public class ProxyPatternClient {

	public static void main(String[] args) {
		Account account = new ProxySavingAccount();
		account.accountType();
	}

}
