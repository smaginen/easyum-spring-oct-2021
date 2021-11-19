package com.easyum.multiplication.configuration;

import com.fasterxml.jackson.databind.Module;
import com.fasterxml.jackson.datatype.hibernate5.Hibernate5Module;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JsonConfiguration {
    @Value("${spring.h2.console.enabled}")
    private String value;

    @Bean
    public Module hibernateModule() {
        return new Hibernate5Module();
    }

}
