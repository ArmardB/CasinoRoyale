package io.royale7.casino;


import java.util.ArrayList;
import java.util.List;

public abstract class Game{

    private static int gameID;
    protected List<Player> playersContainer = new ArrayList<>();

    public abstract void settle();

    public abstract void bet();

    public abstract void init();

    public void setPlayersContainer(List<Player> players){
        this.playersContainer = players;
        System.out.println(playersContainer);
    }

    public List<Player> getPlayers(){
        return this.playersContainer;
    }

}
