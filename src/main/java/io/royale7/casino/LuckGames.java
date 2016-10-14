package io.royale7.casino;

import java.util.ArrayList;

public abstract class LuckGames extends Game {

    private ArrayList players;

    public LuckGames(ArrayList<Player> players){
        super(players);
        this.players = players;
    }

    public abstract void init();

}