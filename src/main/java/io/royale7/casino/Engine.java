package io.royale7.casino;

/**
 * Created by robertodedeus on 10/12/16.
 */
public class Engine {

    PlayerManager playerManager;
    GameManager gameManager;

    Engine() {
        playerManager = new PlayerManager();
        gameManager = new GameManager();
    }

    protected Player login(int playerID, String password) throws NullPointerException{
        return null;
    }

    protected Player getDefaultPlayer(){
        return null;
    }

    protected Player createDefaultPlayer(String name, String password){
        return null;
    }

    protected Game play(int gameID) {
        return gameManager.getGame(gameID);
    }

    protected void exit() {
        
    }


}
