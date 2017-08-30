package com.xp.effective.chapter2.p28;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportResource;

/**
 * @author xp
 */
@Configuration
@Import({CDPlayerConfig.class})
@ImportResource("classpath:c2/p28.xml")
public class SoundSystemConfig {
}
