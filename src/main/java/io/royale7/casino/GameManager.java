package io.royale7.casino;

import java.util.HashMap;
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
    public static Map<Integer, Game> gameContainer = new HashMap<Integer, Game>();
    static {
        //gameContainer.put(1, new Craps());
        //gameContainer.put(2, new Slots());
        //gameContainer.put(3, new HorseRacing());
        //gameContainer.put(4, new Blackjack());
        //gameContainer.put(5, new Baccarat());
        //gameContainer.put(6, new War());
        //gameContainer.put(7, new HighLow());
        gameContainer.put(8, new PittyPat());
    }


    //May return Null
    public Game getGame(int gameId){
        return gameContainer.get(gameId);
    }

}
