package com.easyum.spring.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.easyum.spring.repository.AccountRepository;
import com.easyum.spring.repository.TransferRepository;
import com.easyum.spring.repository.jdbc.JdbcAccountRepository;
import com.easyum.spring.repository.jdbc.JdbcTransferRepository;
import com.easyum.spring.service.TransferService;
import com.easyum.spring.service.TransferServiceImpl;

@Configuration
@ComponentScan(basePackageClasses={TransferService.class, AccountRepository.class})
public class AppConfig {
	
	@Bean
	public TransferService transferService(){
		return new TransferServiceImpl(accountRepository(), transferRepository());
	}
	@Bean
	public AccountRepository accountRepository() {
		return new JdbcAccountRepository();
	}
	@Bean
	public TransferRepository transferRepository() {
		return new JdbcTransferRepository();
	}
}
