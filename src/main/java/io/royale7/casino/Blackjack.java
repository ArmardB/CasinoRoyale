package io.royale7.casino;

import java.util.ArrayList;
import java.util.List;

public class Blackjack extends CardGames {

    private List<CardPlayer> blackjackPlayers = new ArrayList<>();

    public Blackjack(List<Player> players){
        super(players);
        this.blackjackPlayers = super.cardPlayers;
    }

    public void init(){
        Display.outputLn("Blackjack");
    }

}
