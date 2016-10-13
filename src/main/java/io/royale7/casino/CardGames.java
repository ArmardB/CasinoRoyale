package io.royale7.casino;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public abstract class CardGames extends Game{
    protected ArrayList cardPlayers;
    protected HashMap<Integer, List<Card>> gameTable = new HashMap<>();
    protected List<Card> playerHand = new ArrayList<>();
    protected Deck deck;

    public CardGames(ArrayList<Player> players){
        super(players);
        this.createDeck();
        this.cardPlayers = initializeCardPlayers(players);
    }

    private ArrayList<CardPlayer> initializeCardPlayers(ArrayList<Player> players){
        ArrayList<CardPlayer> cardPlayers = new ArrayList<>();
        for(Player player:players){
            cardPlayers.add(new CardPlayer(player));
        }
        return cardPlayers;
    }

    public HashMap<Integer,List<Card>> deal(int handSize){
        this.shuffle();
        this.setGameTable();
        for(int i = 0; i < handSize; i++){
            for (CardPlayer c: cardPlayers){
                gameTable.get(c).add(deck.cards.get(i));
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
        Collections.shuffle(deck.cards);
    }

    private Deck createDeck(){
        deck = new Deck();
        return deck;
    }
    public abstract void init();
}
