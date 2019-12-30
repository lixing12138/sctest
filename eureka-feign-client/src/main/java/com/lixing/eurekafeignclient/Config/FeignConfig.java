package com.lixing.eurekafeignclient.Config;

import feign.Retryer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FeignConfig {
    @Bean
    public Retryer feignRertyer(){
        return new Retryer.Default(100, 1,5);
    }
}
