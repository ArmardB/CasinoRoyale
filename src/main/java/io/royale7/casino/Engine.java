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

    protected Player createNewPlayer(String name, String password){
        Player newPlayer = playerManager.createNewPlayer(name, password);
        loggedInPlayersContainer.add(newPlayer);
        return newPlayer;
    }

    protected Player login(int userID, String password) throws NullPointerException{
        Player loggedInPlayer = playerManager.login(userID, password);
        if(loggedInPlayer != playerManager.getDefaultPlayer()){
            loggedInPlayersContainer.add(loggedInPlayer);
            return loggedInPlayer;
        } else {
            return null;
        }
    }

    protected Player getDefaultPlayer(){
        return playerManager.getDefaultPlayer();
    }

    public List<Player> getLoggedInPlayersContainer() {
        return loggedInPlayersContainer;

    }

    protected Game play(int gameID) {
        Game game = gameManager.getGame(gameID);
        game.setPlayersContainer(loggedInPlayersContainer);
        return game;
    }

    protected void exitCasino() {
        // Cash out and write out to storage
    }


}
