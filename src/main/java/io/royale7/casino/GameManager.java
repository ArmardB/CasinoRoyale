package io.royale7.casino;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Slots
 Horse Racing
 Street Craps
 Blackjack
 War
 High-low
 Pitty Pat
 Baccarat
 *
 */

public class GameManager {

    //won't work until all games are created and extend Game
    public Map<Integer, Game> gameContainer;

    public void createGamesContainer(List<Player> loggedInPlayersContainer){
        this.gameContainer = new HashMap<Integer, Game>();
        //gameContainer.put(1, new Craps());
        //gameContainer.put(2, new Slots());
        //gameContainer.put(3, new HorseRacing());
        //gameContainer.put(4, new Blackjack());
        //gameContainer.put(5, new Baccarat());
        gameContainer.put(6, new War(loggedInPlayersContainer));
        gameContainer.put(7, new HighLow(loggedInPlayersContainer));
        gameContainer.put(8, new PittyPat(loggedInPlayersContainer));
    }


    //May return Null
    public Game getGame(int gameId, List<Player> loggedInPlayersContainer){
        createGamesContainer(loggedInPlayersContainer);
        return gameContainer.get(gameId);
    }

}
