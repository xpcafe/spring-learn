package com.xp.effective.chapter2.p27;

import com.xp.effective.chapter2.p22.CompactDisc;
import org.springframework.stereotype.Component;

/**
 * @author xp
 */
@Component
public class BlankDisc implements CompactDisc {

    private String title;
    private String artist;

    public BlankDisc(String title,String artist){
        this.artist = artist;
        this.title = title;
    }

    public void play() {
        System.out.println("Playing " + title + " by " + artist);
    }
}
