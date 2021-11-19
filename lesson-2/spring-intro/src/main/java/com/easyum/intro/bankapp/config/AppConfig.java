package com.easyum.intro.bankapp.config;

import com.easyum.intro.bankapp.aspect.LoggingAspect;
import com.easyum.intro.bankapp.repository.AccountRepository;
import com.easyum.intro.bankapp.repository.TransferRepository;
import com.easyum.intro.bankapp.repository.jdbc.JdbcAccountRepository;
import com.easyum.intro.bankapp.repository.jdbc.JdbcTransferRepository;
import com.easyum.intro.bankapp.service.TransferService;
import com.easyum.intro.bankapp.service.TransferServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.Primary;

import java.util.Collection;

@Configuration
@EnableAspectJAutoProxy
public class AppConfig {

	
	@Bean
	@Qualifier("transferService1")
	public TransferService transferService1(@Autowired AccountRepository accountRepository,
										   @Autowired TransferRepository transferRepository){
		return new TransferServiceImpl(accountRepository, transferRepository);
	}

	@Bean
	@Qualifier("transferService2")
	public TransferService transferService2(@Autowired AccountRepository accountRepository,
										   @Autowired TransferRepository transferRepository){
		return new TransferServiceImpl(accountRepository, transferRepository);
	}

	@Bean
	@Qualifier("transferService3")
	public TransferService transferService3(@Autowired AccountRepository accountRepository,
											@Autowired TransferRepository transferRepository){
		return new TransferServiceImpl(accountRepository, transferRepository);
	}

	@Bean
	public AccountRepository accountRepository() {
		return new JdbcAccountRepository();
	}
	@Bean
	public TransferRepository transferRepository() {
		return new JdbcTransferRepository();
	}
	@Bean
	public LoggingAspect loggingAspect() {
		return new LoggingAspect();
	}
}
