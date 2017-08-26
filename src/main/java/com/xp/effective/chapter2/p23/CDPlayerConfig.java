package com.xp.effective.chapter2.p23;

import com.xp.effective.chapter2.p21.MediaPlayer;
import com.xp.effective.chapter2.p22.CompactDisc;
import com.xp.effective.chapter2.p22.SgtPeppers;
import com.xp.effective.chapter2.p26.CDPlayer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

/**
 * @author xp
 */
@Configuration
//@ComponentScan(basePackages = "com.xp.effective.chapter2")
public class CDPlayerConfig {
    @Bean
    @Scope("prototype")
    public CompactDisc sgtPeppers(){
        return new SgtPeppers();
    }

    @Bean
    public MediaPlayer cdPlayer(){
        return new CDPlayer(sgtPeppers());
    }
}
