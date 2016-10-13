package io.royale7.casino;


import java.util.ArrayList;
import java.util.List;

/**
 * Created by robertodedeus on 10/12/16.
 */
public abstract class Game {

    private static int gameID;
    private ArrayList<Player> players = new ArrayList<>();

    public Game(ArrayList<Player> players){
        this.players = players;
    }

    public ArrayList<Player> getPlayers(){
        return this.players;
    }

}
