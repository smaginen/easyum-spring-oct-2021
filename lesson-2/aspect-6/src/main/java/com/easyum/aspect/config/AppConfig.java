package com.easyum.aspect.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import com.easyum.aspect.aspect.Auditing;

/**
 *
 *
 */
@Configuration
@EnableAspectJAutoProxy
@ComponentScan(basePackages={"com.easyum.aspect.service"})
public class AppConfig {
	@Bean
	public Auditing auditing() {
		return new Auditing();
	}
}
