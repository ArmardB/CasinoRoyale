package io.royale7.casino;

import io.royale7.casino.Slots.Slot;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class SlotsTest {
    Slots s;
    List<Player> playerList;

    @Before
    public void init() {
        Engine engine = new Engine();
        engine.createNewPlayer("jon", "123");
        engine.login(1, "123");
        s = new Slots(engine.getLoggedInPlayersContainer());
    }

    @Test
    public void setupTest() {
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