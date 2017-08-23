package com.xp.effective.chapter1.p19;

import java.io.PrintStream;

/**
 * @author xp
 * @time 2017/8/23
 */
public class Minstrel {

    private PrintStream stream;

    public Minstrel(PrintStream stream) {
        this.stream = stream;
    }

    public void singBeforeQuest() {
        stream.println("发啦啦，骑士开始探险了...");
    }

    public void singAfterQuest() {
        stream.println("劈哒哒，勇敢的骑士执行完了任务...");
    }

}
