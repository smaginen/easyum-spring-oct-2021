package com.easyum.design.facade.pattern;

import com.easyum.design.model.Account;

/**
 *
 *
 */
public class BankingServiceFacadeImpl implements BankingServiceFacade{

	@Override
	public void moneyTransfer() {
		if(PaymentService.doPayment()){
			Account fromAccount = AccountService.getAccount("1");
			Account toAccount   = AccountService.getAccount("2");
			TransferService.transfer(1000, fromAccount, toAccount);
		}
	}
}
