package com.easyum.jdbc;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.easyum.jdbc.config.AppConfig;
import com.easyum.jdbc.service.TransferService;

/**
 *
 *
 */
public class SpringJdbcDemo {

	public static void main(String[] args) {
		ConfigurableApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
		TransferService transferService = applicationContext.getBean(TransferService.class);
		transferService.transfer(50000l, 1000l, 2000l);
		applicationContext.close();
	}
}
