package io.royale7.casino;

import java.util.ArrayList;
import java.util.List;

public class PittyPat extends CardGames{
    private Deck deck;
    private Card topofDeck;
    private List<Card> pileOfMatches;
    private List<Card> dealerHand;
    private static int handSize = 5;
    private List<CardPlayer> cardPlayers = new ArrayList<>();

    public PittyPat(ArrayList<Player> players){
        super(players);
        this.cardPlayers = super.cardPlayers;
    }

    public void init(){
        Display.outputLn("PittyPat");
    }

    public void removeCardFromDeck(List<Card> hand){
        for (int i = 0; i < hand.size() ; i++) {

        }
    }

}
