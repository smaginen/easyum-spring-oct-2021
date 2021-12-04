package com.easyum.spring.repository;

import org.springframework.beans.factory.FactoryBean;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.Random;


@Component
public class AccountRepositoryFactoryBean implements FactoryBean<IAccountRepository> {

	public static final AccountRepository ACCOUNT_REPOSITORY = new AccountRepository();

	@PostConstruct
	public void setup(){

	}

	@Override
	public IAccountRepository getObject() throws Exception {
		int random = new Random().nextInt();
		Object clone = ACCOUNT_REPOSITORY.clone();
		AccountRepository accountRepository = (AccountRepository) clone;
		accountRepository.setCount(random);
		return accountRepository;
	}
	@Override
	public Class<?> getObjectType() {
		return IAccountRepository.class;
	}
	@Override
	public boolean isSingleton() {
		return false;
	}
}
