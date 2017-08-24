package com.xp.effective.chapter2.p22;

import com.xp.effective.chapter2.p21.CompactDisc;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * @author xp
 */
@Component
@Scope("prototype")
public class SgtPeppers implements CompactDisc {

    private String title = "Sgt. Pepper's Lonely Hearts Club Band";

    private String artist = "The Beatles";

    public void play() {
        System.out.println("playing" + title + " by " + artist);
    }
}
