package io.royale7.casino;

import java.util.ArrayList;
import java.util.List;


public class Deck {

    public List<Card> cards = new ArrayList<Card>();


    public Deck(){
        for(Rank rank: Rank.values()){
            for(Suit suit: Suit.values()){
                cards.add(new Card(rank, suit));
            }
        }
    }

}

