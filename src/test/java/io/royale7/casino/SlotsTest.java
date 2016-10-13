package io.royale7.casino;

import io.royale7.casino.Slots.Slot;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;

public class SlotsTest {
    Slots s;
    List<Player> playerList;

    @Before
    public void init() {
        playerList = new ArrayList<>();
        playerList.add(new Player("jon", "123"));
        s = new Slots(playerList);
    }

    @Test
    public void setupTest() {
//        s.init();
        assertNotNull(s.getPlayer());
    }

    @Test
    public void determineWinningsTest() {
        Slot[][] slots = s.getSlots();
        slots[1] = new Slot[]{Slot.SEVEN, Slot.SEVEN, Slot.SEVEN};
        int expected = 500;
        s.determineWinnings();
        assertEquals(expected, s.getWinAmount());
    }

    @Test
    public void slotsTest() {
        double enterBalance = s.getPlayer().getAccountBalance();
//        s.init();
        double exitBalance = s.getPlayer().getAccountBalance();
        assertNotEquals(enterBalance, exitBalance);
    }

}