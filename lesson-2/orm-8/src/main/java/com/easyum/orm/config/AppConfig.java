package com.easyum.orm.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 *
 *
 */
@Configuration
@ComponentScan(basePackages={"com.easyum.orm.repository", "com.easyum.orm.service"})
@Import({InfrastructureConfig.class})
public class AppConfig {
	
}
