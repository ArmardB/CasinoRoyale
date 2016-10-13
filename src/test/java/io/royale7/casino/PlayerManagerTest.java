package io.royale7.casino;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by jonathanleczner on 10/12/16.
 */
public class PlayerManagerTest {
    PlayerManager pm = new PlayerManager();

    @Test
    public void loginTest() {
        Player expected = new Player("Naz", "higgdiggly");
        Player actual = pm.login(0, "higgdiggly");
        assertEquals(expected, actual);
    }

    @Test
    public void loginFailTest() {
        Player expected = new Player("Naz", "higgdiggly");
        Player actual = pm.login(0, "billybob");
        assertEquals(expected, actual);
    }

    @Test
    public void getDefaultPlayerTest() {

    }

    @Test
    public void createNewPlayerTest() {

    }
}
