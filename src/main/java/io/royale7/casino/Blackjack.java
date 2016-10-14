package io.royale7.casino;

import java.util.ArrayList;
import java.util.List;

public class Blackjack extends CardGame{

    private List<CardPlayer> blackjackPlayers = new ArrayList<>();

    public Blackjack(ArrayList<Player> players){
        super(players);
        this.blackjackPlayers = super.cardPlayers;
    }

    public void init(){
        Display.outputLn("Blackjack");
    }

}
