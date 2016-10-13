package io.royale7.casino;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

/**
 * Created by jonathanleczner on 10/12/16.
 */
public class PlayerManagerTest {
    PlayerManager pm;

    @Test
    public void loginTest() {
        pm = new PlayerManager();

        Player expected = pm.createNewPlayer("Naz", "higgdiggly");
        Player actual = pm.login(1, "higgdiggly");
        assertEquals(expected.toString(), actual.toString());
    }

    @Test
    public void loginFailWrongPasswordTest() {
        pm = new PlayerManager();
        Player expected = pm.createNewPlayer("Naz", "higgy");
        Player actual = pm.login(1, "billybob");
        assertNotEquals(expected.toString(), actual.toString());
    }
    @Test
    public void loginFailWrongUserTest() {
        pm = new PlayerManager();
        Player expected = pm.createNewPlayer("Naz", "higgdiggly");
        Player actual = pm.login(145, "higgdiggly");
        assertNotEquals(expected.toString(), actual.toString());
    }
    @Test
    public void loginFailInvalidUserTest() {
        pm = new PlayerManager();
        Player expected = pm.getDefaultPlayer();
        Player actual = pm.login(0, "higgdiggly");
        assertEquals(expected.toString(), actual.toString());
    }

    @Test
    public void createNewPlayerTest() {
        pm = new PlayerManager();
        Player actual = pm.createNewPlayer("Naz", "higgdiggly");
        Player expected = pm.getPlayerContainer().get(1);
        assertEquals(expected.toString(), actual.toString());
    }
}
