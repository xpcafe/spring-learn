package com.xp.effective.chapter3.p34;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author xp
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = Config.class)
public class ProxyTest {

    @Autowired
    private Actual actual;


    @Test
    public void test(){
        System.out.println(actual.getShoppingCart());
        System.out.println(actual.getShoppingCart());
        System.out.println(actual.getShoppingCart());

        actual.out();
        actual.out();
        actual.out();
        actual.out();
    }
}
