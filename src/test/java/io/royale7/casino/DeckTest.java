package io.royale7.casino;
import org.junit.Assert;
import org.junit.Test;

public class DeckTest {

    @Test
    public void createDeckTest(){
        Deck deck = new Deck();
        int actualOutput = deck.cards.size();
        int expectedOutput = 52;
        Assert.assertEquals("The deck should have 52 cards", expectedOutput, actualOutput);
    }

}
