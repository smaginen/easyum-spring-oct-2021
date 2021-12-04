package com.easyum.design.adapter.pattern;

import com.easyum.design.model.Account;

/**
 *
 *
 */
public class PaymentGatewayImpl implements PaymentGateway{
	@Override
	public void doPayment(Account account1, Account account2){
		System.out.println("Do payment using Payment Gateway");
	}
	
}
