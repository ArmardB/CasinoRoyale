package io.royale7.casino;


import java.util.ArrayList;
import java.util.List;

public abstract class Game{

    private static int gameID;
    protected List<Player> setPlayersContainer = new ArrayList<>();
    private ArrayList<Player> players = new ArrayList<>();

    public abstract void settle();

    public abstract void bet();

    public abstract void init();

    public void setPlayersContainer(List<Player> players){
        this.setPlayersContainer = players;
    }

    public ArrayList<Player> getPlayers(){
        return this.players;
    }

}
