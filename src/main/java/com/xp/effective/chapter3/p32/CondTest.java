package com.xp.effective.chapter3.p32;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author xp
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = testCondConfig.class)
public class CondTest {

    @Autowired
    private MagicBean magicBean;

    @Test
    public void test() {
        System.out.println(magicBean);
    }

}
