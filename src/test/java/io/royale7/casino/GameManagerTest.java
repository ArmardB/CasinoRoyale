package io.royale7.casino;

import org.junit.Assert;
import org.junit.Test;

public class GameManagerTest {


    @Test
    public void getGameTest() {
        Engine engine = new Engine();
        GameManager gameManager = new GameManager();
        Game game = gameManager.getGame(6, engine.getLoggedInPlayersContainer());
        Assert.assertTrue(game instanceof Craps);

    }
}

