package com.xp.effective.chapter1.p15;

import com.xp.effective.chapter1.p12.Knight;
import com.xp.effective.chapter1.p12.Quest;
import com.xp.effective.chapter1.p13.BraveKnight;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author xp
 * @time 2017/8/23
 */
@Configuration
public class KnightConfig {
    @Bean
    public Knight knight() {
        return new BraveKnight(quest());
    }

    @Bean
    public Quest quest() {
        return new SlayDragonQuest(System.out);
    }
}
