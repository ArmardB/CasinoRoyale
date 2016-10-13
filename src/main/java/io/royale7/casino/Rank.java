package io.royale7.casino;

/**
 * Created by sujatharavikumar on 10/12/16.
 */
public enum Rank {

    Two(2), Three(3), Four(4), Five(5), Six(6), Seven(7), Eight(8), Nine(9), Ten(10), Ace(11), King(12), Queen(13), Jack(14);

    private int cardValue;

    private Rank(int cardValue){
        this.cardValue = cardValue;
    }

    public int getCardValue() {
        return cardValue;
    }
}
