package io.royale7.casino;

import org.junit.Assert;
import org.junit.Test;

public class EngineTest {


    @Test
    public void createNewPlayerTest(){
        Engine engine = new Engine();
        engine.createNewPlayer("Player 1", "123");
        Assert.assertNotNull(engine.playerManager.getPlayerContainer().get(1));
    }

    @Test
    public void loginTest(){
        Engine engine = new Engine();
        Player expected = engine.playerManager.createNewPlayer("Player 1", "123");
        Player actual = engine.login(1, "123");
        Assert.assertSame("Login did not return the expected user", expected, actual);
    }

    @Test
    public void getDefaultPlayerTest(){
        Engine engine = new Engine();
        Player expected = engine.playerManager.getPlayerContainer().get(0);
        Player actual = engine.getDefaultPlayer();
        Assert.assertSame("getPlayerDefault method did not return the expected object", expected, actual);
    }

    @Test
    public void getLoggedInPlayersContainer(){
        Engine engine = new Engine();
        engine.createNewPlayer("Player 1", "123");
        engine.createNewPlayer("Player 2", "124");
        Integer actual = engine.getLoggedInPlayersContainer().size();
        Integer expected = 2;
        Assert.assertEquals("Container should be of size 2", expected,actual);
    }

    @Test
    public void playTest(){
        Engine engine = new Engine();

        Game actual = engine.play(1);
        Game expected = engine.gameManager.getGame(6, engine.getLoggedInPlayersContainer());
        Assert.assertEquals("Should return Craps", expected, actual);
    }


}
