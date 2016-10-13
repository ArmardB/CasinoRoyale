package io.royale7.casino;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by sujatharavikumar on 10/13/16.
 */
public class GameManagerTest {

    @Test
    public void getGameTest() {
        GameManager gameManager = new GameManager();
        Game game = gameManager.getGame(1);
        Assert.assertTrue(game instanceof Craps);

    }
}