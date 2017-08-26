package com.xp.effective.chapter2.p25;

import com.xp.effective.chapter2.p21.MediaPlayer;
import com.xp.effective.chapter2.p22.CompactDisc;
import com.xp.effective.chapter2.p23.CDPlayerConfig;
import org.junit.Assert;
import org.junit.Test;
import org.junit.contrib.java.lang.system.StandardOutputStreamLog;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author xp
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = CDPlayerConfig.class)
public class CDPlayTest {

    public final StandardOutputStreamLog log = new StandardOutputStreamLog();

    @Autowired
    private MediaPlayer player;

    @Autowired
    private CompactDisc cd;

    @Test
    public void cdShouldNoBeNull(){
        Assert.assertNotNull(player);
    }

    @Test
    public void play(){
        player.play();
        cd.play();
        System.out.println(player+" "+cd);
        log.getLog();
    }
}
