package io.royale7.casino;

import java.util.HashMap;
import java.util.Map;


public class PlayerManager {
    private Map<Integer, Player> playerContainer;
    private Player invalidPlayer = new Player("Invalid Player", "Invalid Player Password");

    public PlayerManager(){
        playerContainer = new HashMap<>();
        playerContainer.put(0, invalidPlayer);
    }

    public Map<Integer, Player> getPlayerContainer() {
        return playerContainer;
    }

    protected Player getDefaultPlayer() {
        return playerContainer.get(0);
    }

    protected Player createNewPlayer(String name, String password) {
        Player newPlayer = new Player(name, password);
        playerContainer.put(newPlayer.getId(), newPlayer);
        return newPlayer;
    }

    protected Player login(int id, String password) {
        Player loginResult = getDefaultPlayer();
        if (playerContainer.containsKey(id)) {
            Player query = playerContainer.get(id);
            if (query.getPassword().equals(password)) {
                loginResult = query;
            }
        }
        return loginResult;
    }
}