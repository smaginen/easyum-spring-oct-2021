package com.easyum.spring.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.easyum.spring.repository.AccountRepositoryFactoryBean;
import com.easyum.spring.service.TransferService;

/**
 *
 *
 */
@Configuration
public class AppConfig {
	@Bean
	public TransferService transferService() throws Exception{
		return new TransferService(accountRepository().getObject());
	}
	@Bean
	public AccountRepositoryFactoryBean accountRepository(){
		return new AccountRepositoryFactoryBean();
	}
}
