package io.royale7.casino;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by jonathanleczner on 10/12/16.
 */
public class PlayerTest {
    Player p1 = new Player("jon", "123");
    Player p2 = new Player("naz", "234");

    @Test
    public void idTest() {
        assertEquals(1, p2.getId());
    }
}
