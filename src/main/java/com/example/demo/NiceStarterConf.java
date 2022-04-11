package com.example.demo;

import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * @author Evgeny Borisov
 */
@Configuration
@EnableScheduling
@EnableConfigurationProperties(NiceStarterPropertyHolder.class)
public class NiceStarterConf {

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "server.port", havingValue = "8080")
    public NiceHelloService niceHelloService() {
        return new NiceHelloService();
    }

    @Bean
    @ConditionalOnProperty("nice.project-name")
    public NiceLogger niceLogger() {
        return new NiceLogger();
    }


    @Bean
    public BenchmarkAspect benchmarkAspect(){
        return new BenchmarkAspect();
    }


}
