package io.royale7.casino;

import java.util.ArrayList;
import java.util.List;

public class War extends CardGame {

    private List<CardPlayer> warPlayers = new ArrayList<>();

    War(List<Player> players){
        super(players);
        this.warPlayers = super.cardPlayers;
    }

    public void init(){
        Display.outputLn("War");


    }
}
