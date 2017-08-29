package com.xp.effective.chapter2.p29;

import com.xp.effective.chapter2.p22.CompactDisc;
import com.xp.effective.chapter2.p28.CDPlayer;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author xp
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:p29.xml")
public class P29Test {

    @Autowired
    private CompactDisc compactDisc;

    @Autowired
    private CDPlayer cdPlayer;

    private ClassPathXmlApplicationContext context;

    @Before
    public void init(){
//        context = new ClassPathXmlApplicationContext("p29.xml");
    }

    @Test
    public void play() {
        compactDisc.play();
        cdPlayer.play();
        System.out.println(compactDisc+" "+cdPlayer);
    }

}
