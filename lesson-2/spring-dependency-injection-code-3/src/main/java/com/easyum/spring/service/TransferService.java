package com.easyum.spring.service;

import com.easyum.spring.model.Amount;

public interface TransferService {
	
	void transferAmmount(Long a, Long b, Amount amount);
}
