package io.royale7.casino;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public abstract class CardGames extends Game{
    protected List<CardPlayer> cardPlayers = new ArrayList<>();
    protected HashMap<CardPlayer, List<Card>> gameTable;
    protected Deck deck;

    public CardGames(List<Player> players){
        super(players);
        this.createDeck();
        this.cardPlayers = initializeCardPlayers(players);
    }


    protected List<CardPlayer> initializeCardPlayers(List<Player> players){
        cardPlayers.add(new CardPlayer());
        for(Player player:players){
            cardPlayers.add(new CardPlayer(player));
        }
        return cardPlayers;
    }

    private Deck createDeck(){
        deck = new Deck();
        return deck;
    }

    public abstract void init();

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

    private void shuffle(){
        Collections.shuffle(deck.cards);
    }

    private void setGameTable(){
        for (CardPlayer c: cardPlayers) {
            gameTable.put(c, c.getHand());
        }
    }

    @Override
    public double settle(double winnings){
        return 0.0;
    }

    @Override
    public double bet(double bet){
        return 0.0;
    }

}


