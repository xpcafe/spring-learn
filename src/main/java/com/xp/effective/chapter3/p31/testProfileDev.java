package com.xp.effective.chapter3.p31;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

/**
 * @author xp
 */
@Configuration
@Profile("dev")
public class testProfileDev {

//    @Bean
    public String dataSource(){
        return "dev_dataSource";
    }

}
