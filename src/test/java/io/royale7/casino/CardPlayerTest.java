package io.royale7.casino;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class CardPlayerTest {
    CardPlayer dealer;
    CardPlayer player;

    @Before
    public void init() {
        Player.resetIdCounter();
        dealer = new CardPlayer();
        player = new CardPlayer(new Player("jon", "123"));
    }

    @Test
    public void getIdTest() {
        int expected = 2; // dealer is 1, invalid is 0
        int actual = player.getCardPlayerID();
        assertEquals(expected, actual);
    }

    @Test
    public void getHandTest() {
        assertTrue(player.getHand().isEmpty());
    }

    @Test
    public void isDealerTest() {
        assertTrue(dealer.isDealer());
    }
}
