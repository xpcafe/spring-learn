package com.xp.effective.chapter3.p31;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author xp
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = testConfig.class)
@ActiveProfiles("prod")
public class ProfileTest {

    @Autowired
    private String profile;

    @Test
    public void printProfile() {
        System.out.println(profile);
    }

}
