package io.royale7.casino;

import java.util.ArrayList;
import java.util.List;

public class PittyPat extends CardGame {
    private Deck deck;
    private Card topofDeck;
    private List<Card> pileOfMatches;
    private List<Card> dealerHand;
    private static int handSize = 5;
    private List<CardPlayer> pittypatPlayers = new ArrayList<>();

    public PittyPat(List<Player> players){
        super(players);
        this.pittypatPlayers = super.cardPlayers;
    }

    public void init(){
        Display.outputLn("PittyPat");
    }

    public double settle(double winnings){
        return 0.0;
    }

    public double bet(double bet){
        return 0.0;
    }

}
