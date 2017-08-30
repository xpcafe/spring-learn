package com.xp.effective.chapter2.p27;

import com.xp.effective.chapter2.p21.MediaPlayer;
import com.xp.effective.chapter2.p22.CompactDisc;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author xp
 */
public class P27Test {

    private CompactDisc compactDisc;

    private MediaPlayer mediaPlayer;

    private ClassPathXmlApplicationContext context;

    @Before
    public void init(){
        context = new ClassPathXmlApplicationContext("c2/p27.xml");
    }

    @Test
    public void play() {
        compactDisc = (CompactDisc) context.getBean("compactDisc");
        compactDisc.play();
        mediaPlayer = (MediaPlayer) context.getBean("cdPlayer");
        mediaPlayer.play();
    }
}
