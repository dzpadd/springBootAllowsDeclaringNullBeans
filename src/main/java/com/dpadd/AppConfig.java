package com.dpadd;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
class AppConfig {

    @Bean
    public CardNumberProvider cardNumberProvider() {
        return null;
    }
}