package io.royale7.casino;


import java.util.ArrayList;
import java.util.List;

/**
 * Created by robertodedeus on 10/12/16.
 */
public abstract class Game {

    private static int gameID;
    private List<Player> setPlayers;
    private ArrayList<Player> players = new ArrayList<>();

    public Game(ArrayList<Player> players){
        this.players = players;
    }

    public void setPlayers(List<Player> players){
        this.setPlayers= players;
    }

    public ArrayList<Player> getPlayers(){
        return this.players;
    }

}
