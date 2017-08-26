package com.xp.effective.chapter2.p26;

import com.xp.effective.chapter2.p21.MediaPlayer;
import com.xp.effective.chapter2.p22.CompactDisc;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * @author xp
 */
@Component
@Scope("prototype")
public class CDPlayer implements MediaPlayer {

    private CompactDisc cd;

    @Autowired
    public CDPlayer(CompactDisc cd){
        this.cd = cd;
    }


    public void play(){
        cd.play();
    }
}
