package com.easyum.design.flyweight.pattern;

import com.easyum.design.model.Account;

/**
 *
 *
 */
public class FlyweightPatternClient {

	public static void main(String[] args) {
		for(int i=0; i < 10; ++i) {
			Account account = (Account)AccountFlyweightFactory.getAccount("SAVING");
			account.accountType();
		}
	}
}
