package com.xp.effective.chapter1.p14;

import com.xp.effective.chapter1.p12.Quest;
import com.xp.effective.chapter1.p13.BraveKnight;
import org.junit.Test;

import static org.mockito.Mockito.*;

public class BraveKnightTest {

    @Test
    public void knightShouldEmbarkOnQuest(){
        Quest mockQuest = mock(Quest.class);
        BraveKnight knight = new BraveKnight(mockQuest);
        knight.embarkOnQuest();
        verify(mockQuest,times(1)).embark();
    }

}
