package io.royale7.casino;

import java.util.ArrayList;
import java.util.List;

public abstract class LuckGames extends Game {

    protected List<Player> luckPlayers = new ArrayList<>();

    public LuckGames(List<Player> players){
        super(players);
        this.luckPlayers = players;
    }

    public abstract void init();

    @Override
    public double settle(double winnings){
        return 0.0;
    }

    @Override
    public double bet(double bet){
        return 0.0;
    }

}
