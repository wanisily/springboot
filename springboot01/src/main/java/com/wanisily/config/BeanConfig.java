package com.wanisily.config;

import com.wanisily.domain.Pig;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfig {
    @ConfigurationProperties(prefix = "pig")
    @Bean
    public Pig pig(){
        return new Pig();
    }
}
