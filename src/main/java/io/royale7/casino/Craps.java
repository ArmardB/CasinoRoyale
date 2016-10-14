package io.royale7.casino;

import java.util.ArrayList;
import java.util.List;

public class Craps extends LuckGames {

    private List<Player> crapsPlayers = new ArrayList<>();

    public Craps(List<Player> players) {
        super(players);
        this.crapsPlayers = players;
    }

    public void init(){
        Display.outputLn("Craps");
    }

}
