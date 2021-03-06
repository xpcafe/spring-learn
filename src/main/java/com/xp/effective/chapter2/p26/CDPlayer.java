package com.xp.effective.chapter2.p26;

import com.xp.effective.chapter2.p21.MediaPlayer;
import com.xp.effective.chapter2.p22.CompactDisc;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author xp
 */
@Component
@Scope("prototype")
public class CDPlayer implements MediaPlayer {

    private CompactDisc cd;

    private List<String> list;

    public CDPlayer(){}

    @Autowired
    public CDPlayer(CompactDisc cd){
        this.cd = cd;
    }

    @Autowired
    public void setCompactDisc(CompactDisc cd){
        this.cd = cd;
    }

    @Autowired
    public void setList(List list){
        this.list = list;
    }


    public void play(){
        cd.play();
        for (String s : list) {
            System.out.println(s);
        }
    }
}
