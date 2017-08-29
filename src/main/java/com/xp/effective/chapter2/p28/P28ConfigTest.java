package com.xp.effective.chapter2.p28;

import com.xp.effective.chapter2.p22.CompactDisc;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author xp
 */
public class P28ConfigTest {

    private CompactDisc compactDisc;

    private ClassPathXmlApplicationContext context;

    @Before
    public void init(){
        context = new ClassPathXmlApplicationContext("p28.xml");
    }

    @Test
    public void play() {
        compactDisc = (CompactDisc) context.getBean("compactDisc");
        compactDisc.play();
    }
}
