package io.royale7.casino;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by jonathanleczner on 10/12/16.
 */
public class PlayerTest {
    @Before
    public void init() {
        Player.resetIdCounter();
    }

    @Test
    public void idTest() {
        Player p1 = new Player("jon", "123");
        Player p2 = new Player("naz", "234");
        assertEquals(2, p2.getId());
    }

    @Test
    public void dealerTest() {
        Player dealer = new Player();
        String expected = "Dealer";
        assertEquals(expected, dealer.getName());
    }

    @Test
    public void accountBalanceTest() {
        Player p1 = new Player("jon", "123");
        p1.setAccountBalance(30000000);
        double expected = 30000000;
        assertEquals(expected, p1.getAccountBalance(), 0.1);
    }
}
