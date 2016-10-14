package io.royale7.casino;


import java.util.ArrayList;
import java.util.List;

public abstract class Game {

    private static int gameID;
    private ArrayList<Player> setPlayers;
    private ArrayList<Player> players = new ArrayList<Player>();

    public Game(ArrayList<Player> players){
        this.players = players;
    }

    public void setPlayers(ArrayList<Player> players){
        this.setPlayers= players;
    }

    public ArrayList<Player> getPlayers(){
        return this.players;
    }

}

