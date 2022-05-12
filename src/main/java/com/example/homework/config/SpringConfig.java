package com.example.homework.config;


import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnExpression;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.*;

@Configuration
public class SpringConfig {

    @Bean
    @Profile("test")
    public Integer One() {
        return 1;
    }

    @Bean
    @ConditionalOnBean(Integer.class)
    public Integer Two() {
        return 2;
    }

    @Bean
    @ConditionalOnExpression("'${some.test.environment-variable}' != 'default'")
    public Integer Three() {
        return 3;
    }

}