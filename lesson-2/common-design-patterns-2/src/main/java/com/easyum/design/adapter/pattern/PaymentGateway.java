package com.easyum.design.adapter.pattern;

import com.easyum.design.model.Account;

public interface PaymentGateway {
	void doPayment(Account account1, Account account2);
}
