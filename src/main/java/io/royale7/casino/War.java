package io.royale7.casino;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class War extends CardGames {

    private List<CardPlayer> warPlayers = new ArrayList<>();

    War(List<Player> players){
        super(players);
        this.warPlayers = super.cardPlayers;
    }

    public void init(){
        Display.outputLn("War");


    }
}
