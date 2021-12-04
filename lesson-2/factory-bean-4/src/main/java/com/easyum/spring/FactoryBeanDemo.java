package com.easyum.spring;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.easyum.spring.service.TransferService;

/**
 * @author Dinesh Rajput
 *
 */
public class FactoryBeanDemo {

	public static void main(String[] args) {
		ConfigurableApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		TransferService transferService = applicationContext.getBean(TransferService.class);
		transferService.transfer("A", "B", 3000.1);
		applicationContext.close();
	}

}
