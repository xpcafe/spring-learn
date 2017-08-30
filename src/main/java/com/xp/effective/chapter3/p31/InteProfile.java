package com.xp.effective.chapter3.p31;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

/**
 * @author xp
 */
@Configuration
public class InteProfile {

    @Bean
    @Profile("dev")
    public String dataSourceDev(){
        return "dev_dataSource";
    }

    @Bean
    @Profile("prod")
    public String dataSourceProd(){
        return "prod_dataSource";
    }
}
