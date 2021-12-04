package com.easyum.jdbc.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportResource;

/**
 *
 *
 */
@Configuration
@ComponentScan(basePackages={"com.easyum.jdbc.repository", "com.easyum.jdbc.service"})//implicity bean creation
@Import({InfrastructureConfig.class, SecurityConfig.class})
public class AppConfig {
	
}
