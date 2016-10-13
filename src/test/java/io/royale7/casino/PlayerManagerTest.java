package io.royale7.casino;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

/**
 * Created by carinablair on 10/13/16.
 */
public class PlayerManagerTest {
    PlayerManager pm;

    @Before
    public void init() {
        pm = new PlayerManager();
        Player.resetIdCounter();
    }

    @Test
    public void loginTest() {
        Player expected = pm.createNewPlayer("Naz", "higgdiggly");
        Player actual = pm.login(1, "higgdiggly");
        assertEquals(expected.toString(), actual.toString());
    }

    @Test
    public void loginFailWrongPasswordTest() {
        Player expected = pm.createNewPlayer("Naz", "higgy");
        Player actual = pm.login(1, "billybob");
        assertNotEquals(expected.toString(), actual.toString());
    }
    @Test
    public void loginFailWrongUserTest() {
        Player expected = pm.createNewPlayer("Naz", "higgdiggly");
        Player actual = pm.login(145, "higgdiggly");
        assertNotEquals(expected.toString(), actual.toString());
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

    @Test
    public void sanityCheck() {
        for (int i = 1; i < 6; i++) {
            pm.createNewPlayer("player" + i, "pass" + i);
            System.out.println(pm.getPlayerContainer().get(i).toString());
        }
    }
}
