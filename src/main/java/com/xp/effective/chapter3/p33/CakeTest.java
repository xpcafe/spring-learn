package com.xp.effective.chapter3.p33;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author xp
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = Config.class)
public class CakeTest {

    @Autowired
    private Dessert dessert;

    @Autowired
    @Qualifier("iceCreamSub")
    private Dessert dessertOther;

    @Test
    public void test(){
        System.out.println(dessert + " " + dessertOther);
    }
}
