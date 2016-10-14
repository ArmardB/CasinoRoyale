package io.royale7.casino;

import java.util.ArrayList;
import java.util.List;

public abstract class Game {

    private static int gameID;
    private List<Player> players = new ArrayList<>();

    public Game(List<Player> players){
        this.players = players;
    }

    public abstract void init();

    public abstract double settle(double winnings);

    public abstract void bet(double bet, Player player);

    public List<Player> getPlayers(){
        return this.players;
    }
}

