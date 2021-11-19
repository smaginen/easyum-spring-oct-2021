package com.easyum.intro.bankapp;

import com.easyum.intro.bankapp.config.AppConfig;
import com.easyum.intro.bankapp.model.Amount;
import com.easyum.intro.bankapp.service.TransferService;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TransferMain {

	public static void main(String[] args) {
		//Load Spring context
		ConfigurableApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
		//Get TransferService bean
		TransferService transferService = applicationContext.getBean(TransferService.class);
		//Use transfer method
		transferService.transferAmmount(100l, 200l, new Amount(2000.0));
		applicationContext.close();
	}

}
