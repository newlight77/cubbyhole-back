package com.kata.cubbyhole.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.transaction.annotation.EnableTransactionManagement;

// import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
// @EnableJpaRepositories("com.kata.cubbyhole.repository")
@EnableJpaAuditing//(auditorAwareRef = "springSecurityAuditorAware")
@EnableTransactionManagement
public class DatabaseConfiguration {
}