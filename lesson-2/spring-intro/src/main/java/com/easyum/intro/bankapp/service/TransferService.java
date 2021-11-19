package com.easyum.intro.bankapp.service;


import com.easyum.intro.bankapp.model.Amount;

public interface TransferService {
	
	void transferAmmount(Long a, Long b, Amount amount);
}
