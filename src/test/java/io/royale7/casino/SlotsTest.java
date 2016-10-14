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
        boolean wonBig = false;
        while (!wonBig) {
            s.playOrQuit("1");
            Slot[] payline = s.getSlots()[1];
            if (payline[0] == payline[1] && payline[1] == payline[2]
                    && payline[0] == Slot.SEVEN) {
                wonBig = true;
            }
        }
        int expected = 500;
        s.determineWinnings();
        assertEquals(expected, s.getWinAmount());
    }

    @Test
    public void slotsTest() {
        double enterBalance = s.getPlayer().getAccountBalance();
        // simulate
        s.welcome();
        s.playOrQuit("1");
        s.playOrQuit("2");

        double exitBalance = s.getPlayer().getAccountBalance();
        assertNotEquals(enterBalance, exitBalance);
    }

}