package com.xp.effective.chapter3.p31;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

/**
 * @author xp
 */
@Configuration
@Profile("prod")
public class testProfileProd {

//    @Bean
    public String dataSource(){
        return "prod_dataSource";
    }

}
