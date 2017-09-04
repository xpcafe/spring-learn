package com.xp.effective.chapter3.p34;

import org.springframework.beans.factory.config.PropertyPlaceholderConfigurer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author xp
 */
@Configuration
@ComponentScan
public class Config {

    @Bean
    public static PropertyPlaceholderConfigurer propertyPlaceholderConfigurer(){
        return new PropertyPlaceholderConfigurer();
    }
}
