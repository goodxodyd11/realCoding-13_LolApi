package org.cnu.realcoding.lolapi.team13.lolapiteam13.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class HttpConfig {

    @Bean
    public RestTemplate createRestTemplage(){return new RestTemplate();}
}
