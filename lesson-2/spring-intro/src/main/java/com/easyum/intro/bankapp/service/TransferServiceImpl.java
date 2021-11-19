package com.easyum.intro.bankapp.service;

import com.easyum.intro.bankapp.model.Account;
import com.easyum.intro.bankapp.model.Amount;
import com.easyum.intro.bankapp.repository.AccountRepository;
import com.easyum.intro.bankapp.repository.TransferRepository;
import org.springframework.stereotype.Component;

@Component
public class TransferServiceImpl implements TransferService {

	AccountRepository accountRepository;
	
	TransferRepository transferRepository;
	
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

}
