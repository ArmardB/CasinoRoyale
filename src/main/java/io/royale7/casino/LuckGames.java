package io.royale7.casino;

import java.util.ArrayList;

/**
 * Created by carinablair on 10/13/16.
 */
public abstract class LuckGames extends Game {

    private ArrayList players;

    public LuckGames(ArrayList<Player> players){
        super(players);
        this.players = players;
    }

    public abstract void init();

}
