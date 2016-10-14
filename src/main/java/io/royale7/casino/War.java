package io.royale7.casino;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class War extends CardGames {

    List<CardPlayer> cardPlayers;

    War(ArrayList<Player> players){
        super(players);
        this.cardPlayers = super.cardPlayers;
    }

    public void init(){
        Display.outputLn("War");


    }
}
