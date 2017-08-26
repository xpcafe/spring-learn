package com.xp.effective.chapter2.p22;

import org.springframework.context.annotation.Scope;

import javax.inject.Named;

/**
 * @author xp
 */
@Named
@Scope("prototype")
public class SgtPeppers implements CompactDisc {

    private String title = "Sgt. Pepper's Lonely Hearts Club Band";

    private String artist = "The Beatles";

    public void play() {
        System.out.println("playing" + title + " by " + artist);
        System.out.println(this);
    }
}
