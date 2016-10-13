package io.royale7.casino;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by armardbellamy on 10/12/16.
 */
public class HiLowTest {

    HighLow highLow;
    Deck deck;

    @Before
    public void init(){
       highLow = new HighLow();
        deck = new Deck();
    }

    @Test
    public void dealACardTest(){
        Suit expected = Suit.Spades;
        Suit actual = deck.cards.get(0).getSuit();
        Assert.assertEquals("Should return card", expected, actual);

    }

    @Test
    public void playAgainTest(){

    }

}
