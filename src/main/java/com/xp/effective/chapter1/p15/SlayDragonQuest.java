package com.xp.effective.chapter1.p15;

import com.xp.effective.chapter1.p12.Quest;

import java.io.PrintStream;

/**
 * @author xp
 * @time 2017/8/23
 */
public class SlayDragonQuest implements Quest {

    private PrintStream stream;

    public SlayDragonQuest(PrintStream stream) {
        this.stream = stream;
    }

    public void embark() {
        stream.println("Embarking on quest to slay the dragon!");
    }
}
