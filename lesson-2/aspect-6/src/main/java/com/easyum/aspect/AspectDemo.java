package com.easyum.aspect;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.easyum.aspect.config.AppConfig;
import com.easyum.aspect.service.TransferService;

/**
 *
 *
 */
public class AspectDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ConfigurableApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
		TransferService transferService = applicationContext.getBean(TransferService.class);
		transferService.transfer("accountA", "accountB", 50000l);
		applicationContext.close();
	}

}
