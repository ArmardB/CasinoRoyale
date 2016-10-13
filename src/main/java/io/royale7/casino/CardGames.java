package io.royale7.casino;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public abstract class CardGames extends Game{
    protected List<Player> players = new ArrayList<>();

    protected List<CardPlayer> cardPlayers = new ArrayList<>();
    protected HashMap<CardPlayer, List<Card>> gameTable = new HashMap<>();
    protected Deck deck;

    public CardGames(){
        this.players = super.setPlayersContainer;
        this.createDeck();
        this.cardPlayers = initializeCardPlayers(players);
    }

    @Override
    public void settle(){

    }

    @Override
    public void bet(){

    }

    public abstract void init();

    protected List<CardPlayer> initializeCardPlayers(List<Player> players){
        cardPlayers.add(new CardPlayer());
        for(Player player:players){
            cardPlayers.add(new CardPlayer(player));
        }
        return cardPlayers;
    }

    private void createDeck(){
        deck = new Deck();
    }

    public HashMap<CardPlayer,List<Card>> deal(int handSize){
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
            gameTable.put(c,c.getHand());
        }
    }

    private void shuffle(){
        Collections.shuffle(deck.cards);
    }

}
