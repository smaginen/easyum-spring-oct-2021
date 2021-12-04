package com.easyum.spring.service;

import com.easyum.spring.repository.IAccountRepository;

/**
 * @author Dinesh Rajput
 *
 */
public class TransferService {
	IAccountRepository accountRepository;
	public TransferService(IAccountRepository accountRepository){
		this.accountRepository = accountRepository;
	}
	public void transfer(String accountA, String accountB, Double amount){
		System.out.println("Amount has been tranferred");
	}
}
