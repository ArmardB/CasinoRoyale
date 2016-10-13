package io.royale7.casino;

/**
 * Created by armardbellamy on 10/12/16.
 */
public class HiLow  {

    Deck deck;
    Card card;

    public void init(){
        deck = new Deck();

    }

    public Card dealACard(){
        return deck.cards.get(0);
    }




}
