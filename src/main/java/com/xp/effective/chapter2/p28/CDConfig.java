package com.xp.effective.chapter2.p28;

import com.xp.effective.chapter2.p22.CompactDisc;
import com.xp.effective.chapter2.p22.SgtPeppers;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author xp
 */
@Configuration
public class CDConfig {

    @Bean
    public CompactDisc compactDisc() {
        return new SgtPeppers();
    }
}
