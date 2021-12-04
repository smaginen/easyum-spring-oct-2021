package com.easyum.design.facade.pattern;

/**
 *
 *
 */
public class FacadePatternClient {
	public static void main(String[] args) {
		BankingServiceFacade serviceFacade = new BankingServiceFacadeImpl();
		serviceFacade.moneyTransfer();
	}

}
