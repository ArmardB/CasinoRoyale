package io.royale7.casino;

import java.util.ArrayList;
import java.util.List;

public class Engine {

    PlayerManager playerManager;
    GameManager gameManager;
    private List<Player> loggedInPlayersContainer;

    Engine() {
        playerManager = new PlayerManager();
        gameManager = new GameManager();
        loggedInPlayersContainer = new ArrayList<>();
    }

    protected Player login(int userID, String password) throws NullPointerException{
        Player loggedInPlayer = playerManager.login(userID, password);
        if(loggedInPlayer != null){
            loggedInPlayersContainer.add(loggedInPlayer);
            return loggedInPlayer;
        } else {
            return null;
        }
    }

    protected Player getDefaultPlayer(){
        return null;
    }

    protected Player createDefaultPlayer(String name, String password){
        return null;
    }

    public List<Player> getLoggedInPlayersContainer() {
        return loggedInPlayersContainer;
    }

    protected Game play(int gameID) {
        return gameManager.getGame(gameID);
    }

    protected void exit() {
        
    }


}
