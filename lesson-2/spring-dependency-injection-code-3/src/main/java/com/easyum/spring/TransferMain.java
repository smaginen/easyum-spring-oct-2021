package com.easyum.spring;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.easyum.spring.config.AppConfig;
import com.easyum.spring.model.Amount;
import com.easyum.spring.service.TransferService;

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
