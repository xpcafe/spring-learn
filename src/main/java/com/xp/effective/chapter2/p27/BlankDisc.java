package com.xp.effective.chapter2.p27;

import com.xp.effective.chapter2.p22.CompactDisc;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Set;

/**
 * @author xp
 */
@Component
public class BlankDisc implements CompactDisc {

    private String title;
    private String artist;
    private List<String> tracks;
    private Set<String> tracksBySet;

    public BlankDisc(String title,String artist,List<String> tracks,Set<String> tracksBySet){
        this.artist = artist;
        this.title = title;
        this.tracks = tracks;
        this.tracksBySet = tracksBySet;
    }

    public void play() {
        System.out.println("Playing " + title + " by " + artist);
        for (String track : tracks) {
            System.out.println(track);
        }
        for (String s : tracksBySet) {
            System.out.println(s);
        }
    }
}
