package com.xp.effective.chapter2.p22;

import com.xp.effective.chapter2.p21.CompactDisc;
import org.junit.Assert;
import org.junit.Test;
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

    @Autowired
    private CompactDisc cd;


    @Autowired
    private CompactDisc cd1;

    @Test
    public void cdShouldNotBeNull(){
        cd.play();
        System.out.println(cd+" "+cd1);
        Assert.assertNotNull(cd);
    }

    public static void main(String[] args) {

    }
}
