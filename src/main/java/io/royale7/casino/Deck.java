package io.royale7.casino;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by sujatharavikumar on 10/12/16.
 */
public class    Deck {

    public List<Card> cards = new ArrayList<Card>();


    public Deck(){
        for(Rank rank: Rank.values()){
            for(Suit suit: Suit.values()){
                cards.add(new Card(rank, suit));
            }
        }
    }

    

    public List<Card> getCards(){
        return this.cards;
    }

    public Card getCard(int index){
        return cards.get(index);
    }



}

