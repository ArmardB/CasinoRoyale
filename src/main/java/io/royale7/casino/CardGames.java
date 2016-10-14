package io.royale7.casino;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public abstract class CardGames extends Game{
    protected List<CardPlayer> cardPlayers = new ArrayList<>();
    protected HashMap<CardPlayer, List<Card>> gameTable = new HashMap<>();
    protected List<Card> playerHand = new ArrayList<>();
    protected Deck deck;

    public CardGames(List<Player> players){
        super(players);
        this.createDeck();
        this.cardPlayers = initializeCardPlayers(players);
    }

    public HashMap<CardPlayer,List<Card>> deal(int handSize) {
        this.shuffle();
        this.setGameTable();
        for(int i = 0; i < handSize; i++){
            for (CardPlayer c: cardPlayers){
                gameTable.get(c).add(deck.cards.get(i));
            }
        }
        return gameTable;
    }

    public abstract void init();

    private Deck createDeck(){
        deck = new Deck();
        return deck;
    }

    protected List<CardPlayer> initializeCardPlayers(List<Player> players){
        cardPlayers.add(new CardPlayer());
        for(Player player:players){
            cardPlayers.add(new CardPlayer(player));
        }
        return cardPlayers;
    }


    private void setGameTable(){
        for (CardPlayer c: cardPlayers) {
        gameTable.put(c, c.getHand());

        }
    }

    private void shuffle(){
        Collections.shuffle(deck.cards);
    }

  }


