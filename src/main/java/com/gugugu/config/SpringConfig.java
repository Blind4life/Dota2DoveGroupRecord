package com.gugugu.config;

import org.springframework.context.annotation.*;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.client.RestTemplate;

@PropertySource({"classpath:ApiRelated.properties", "classpath:jdbc.properties"})
@ComponentScan({"com.gugugu.client", "com.gugugu.dao"})
@Configuration
@Import({JdbcConfig.class, MybatisConfig.class})
@EnableTransactionManagement
@EnableAspectJAutoProxy
public class SpringConfig {
    @Bean
    public RestTemplate restTemplate() {
        RestTemplate restTemplate = new RestTemplate();
        restTemplate.getMessageConverters().add(new MappingJackson2HttpMessageConverter());
        return restTemplate;
    }
}