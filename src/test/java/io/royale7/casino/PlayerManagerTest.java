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
        Player expected = pm.createNewPlayer("Naz", "higgdiggly");
        Player actual = pm.login(1, "higgdiggly");
        assertEquals(expected.toString(), actual.toString());
    }

    @Test
    public void loginFailWrongPasswordTest() {
        Player expected = new Player("Naz", "higgy");
        Player actual = pm.login(1, "billybob");
        assertEquals(expected.toString(), actual.toString());
    }
    @Test
    public void loginFailWrongUserTest() {
        Player expected = new Player("Naz", "higgdiggly");
        Player actual = pm.login(145, "higgdiggly");
        assertEquals(expected.toString(), actual.toString());
    }
    @Test
    public void loginFailInvalidUserTest() {
        Player expected = pm.getDefaultPlayer();
        Player actual = pm.login(0, "higgdiggly");
        assertEquals(expected.toString(), actual.toString());
    }

    @Test
    public void createNewPlayerTest() {
        Player actual = pm.createNewPlayer("Naz", "higgdiggly");
        Player expected = pm.getPlayerContainer().get(1);
        assertEquals(expected.toString(), actual.toString());
    }
}
