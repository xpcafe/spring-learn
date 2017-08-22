package com.xp.effective.chapter1.p13;

import com.xp.effective.chapter1.p12.Knight;
import com.xp.effective.chapter1.p12.Quest;

public class BraveKnight implements Knight {

    private Quest quest;

    public BraveKnight(Quest quest) {
        this.quest = quest;
    }

    public void embarkOnQuest() {
        quest.embark();
    }
}
