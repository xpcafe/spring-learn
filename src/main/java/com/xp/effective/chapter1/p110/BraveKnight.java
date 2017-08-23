package com.xp.effective.chapter1.p110;

import com.xp.effective.chapter1.p12.Knight;
import com.xp.effective.chapter1.p12.Quest;
import com.xp.effective.chapter1.p19.Minstrel;

/**
 * @author xp
 * @time 2017/8/23
 */
public class BraveKnight implements Knight {

    private Quest quest;

    private Minstrel minstrel;

    public void BraveKnight(Quest quest, Minstrel minstrel) {
        this.quest = quest;
        this.minstrel = minstrel;
    }


    public void embarkOnQuest() {
        minstrel.singBeforeQuest();
        quest.embark();
        minstrel.singAfterQuest();
    }
}
