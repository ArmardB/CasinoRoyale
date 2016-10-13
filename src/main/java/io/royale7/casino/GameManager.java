package io.royale7.casino;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Nate Holloway on 10/12/16.
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
        gameContainer.put(1, new Craps());
        //gameContainer.put(2, new Slots());
        //gameContainer.put(3, new HorseRacing());
        //gameContainer.put(4, new Blackjack());
        //gameContainer.put(5, new Baccarat());
        //gameContainer.put(6, new War());
        //gameContainer.put(7, new HighLow());
        //gameContainer.put(8, new PittyPat());
    }


    private boolean addGame(int id, Game game){
        Game addedGame = gameContainer.put(id,game);
        return isSuccessful(addedGame);
    }

    private boolean deleteGame(int id, Game game){
        Game removedGame = gameContainer.remove(id);
        return isSuccessful(removedGame);
    }

    private boolean isSuccessful(Game game){
        boolean success = false;
        if(game !=null) {
            success = true;
        }
        return success;
    }

    //May return Null
    private Game getGame(int gameId){
        return gameContainer.get(gameId);
    }
    
}
