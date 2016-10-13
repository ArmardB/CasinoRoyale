package io.royale7.casino;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by robertodedeus on 10/12/16.
 */
public class PlayerManager {
    private Map<Integer, Player> playerContainer;
    private static Player invalidPlayer = new Player("Invalid Player", null);

    public PlayerManager(){
        playerContainer = new HashMap<>();
    }

    public Map<Integer, Player> getPlayerContainer() {
        return playerContainer;
    }

    protected Player createNewPlayer(String name, String password) {
        return null;
    }

    protected Player getDefaultPlayer() {
        return null;
    }

    protected Player login(int id, String password) {
        Player loginResult = invalidPlayer;
        if (playerContainer.containsKey(id)) {
            Player query = playerContainer.get(id);
            if (query.getPassword().equals(password)) {
                loginResult = query;
            }
        }
        return loginResult;
    }
}
