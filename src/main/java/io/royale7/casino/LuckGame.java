package io.royale7.casino;

import java.util.ArrayList;
import java.util.List;

public abstract class LuckGame extends Game {

    protected List<Player> luckPlayers = new ArrayList<>();

    public LuckGame(List<Player> players){
        super(players);
        this.luckPlayers = players;
    }

    public abstract void init();

    public abstract double settle(double winnings);

    public abstract double bet(double bet);

}