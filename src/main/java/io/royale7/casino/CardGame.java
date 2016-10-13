package io.royale7.casino;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class CardGame extends Game{
    protected List<CardPlayer> cardPlayers = new ArrayList<CardPlayer>();
    protected HashMap<Integer, List<Card>> gameTable = new HashMap<>();
    private List<Card> playerHand = new ArrayList<>();
    private Deck deck;

    CardGame(){
        this.createDeck();
    }


    public CardGame(List<CardPlayer> cardPlayers) {
        this.createDeck();
        this.cardPlayers = cardPlayers;
    }

    public HashMap<Integer,List<Card>> deal(int handSize){
        this.shuffle();
        this.setGameTable();
        for(int i = 0; i < handSize; i++){
            for (CardPlayer c: cardPlayers){
                gameTable.get(c).add(deck.getCard(i));
            }
        }
        return gameTable;

    }

    private void setGameTable(){
        for (CardPlayer c: cardPlayers) {
            gameTable.put(c.getCardPlayerID(), playerHand);
        }
    }

    private void shuffle(){
        Collections.shuffle(deck.getCards());
    }

    private Deck createDeck(){
        deck = new Deck();
        return deck;
    }
}
