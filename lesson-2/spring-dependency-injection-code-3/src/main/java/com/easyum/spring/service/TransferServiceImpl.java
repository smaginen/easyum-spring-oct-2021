package com.easyum.spring.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.easyum.spring.model.Account;
import com.easyum.spring.model.Amount;
import com.easyum.spring.repository.AccountRepository;
import com.easyum.spring.repository.TransferRepository;

public class TransferServiceImpl implements TransferService {
	@Autowired
	AccountRepository accountRepository;
	@Autowired
	TransferRepository transferRepository;
	
	public TransferServiceImpl() {
		super();
	}

	@Autowired
	public TransferServiceImpl(AccountRepository accountRepository, TransferRepository transferRepository) {
		super();
		this.accountRepository = accountRepository;
		this.transferRepository = transferRepository;
	}
	
	@Override
	public void transferAmmount(Long a, Long b, Amount amount) {
		Account accountA = accountRepository.findByAccountId(a);
		Account accountB = accountRepository.findByAccountId(b);
		transferRepository.transfer(accountA, accountB, amount);
	}
	@Autowired(required = false)
	public void setAccountRepository(AccountRepository accountRepository) {
		this.accountRepository = accountRepository;
	}
	@Autowired
	public void setTransferRepository(TransferRepository transferRepository) {
		this.transferRepository = transferRepository;
	}
	
}
