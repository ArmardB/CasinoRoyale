package io.royale7.casino;

import java.util.ArrayList;
import java.util.List;

<<<<<<< HEAD
public class Deck {
    public List<Card> cards = new ArrayList<Card>();
=======
/**
 * Created by sujatharavikumar on 10/12/16.
 */
public class Deck {

    private List<Card> cards = new ArrayList<Card>();
    private Card singleCard;


>>>>>>> 8266d196dc8bc60bafd62daeb8a1ec143233a4c5
    public Deck(){
        for(Rank rank: Rank.values()){
            for(Suit suit: Suit.values()){
                cards.add(new Card(rank, suit));
            }
        }
    }
<<<<<<< HEAD
}
=======

    public List<Card> getCards(){
        return this.cards;
    }

    public Card getCard(int index){
        return cards.get(index);
    }


}
>>>>>>> 8266d196dc8bc60bafd62daeb8a1ec143233a4c5
