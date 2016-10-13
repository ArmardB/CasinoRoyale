package io.royale7.casino;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.List;

public class CardGameTest {
    CardGameMock cardGamesMock;



    private class CardGameMock extends CardGame {

        protected List<CardPlayer> cardPlayers;
        protected List<Player> players;
        protected HashMap<CardPlayer,List<Card>> gameTable;

        public CardGameMock() {
            this.players = super.setPlayersContainer;
            this.cardPlayers = super.cardPlayers;
        }

        public HashMap<CardPlayer,List<Card>> getGameTable(){
            this.gameTable = super.gameTable;
            return gameTable;
        }
        public void init(){}
    }
    @Before
    public void initialize(){
        cardGamesMock = new CardGameMock();
        cardGamesMock.players.add(new Player("Bob", "zoo"));
        cardGamesMock.players.add(new Player("Bill", "aquarium"));
        cardGamesMock.players.add(new Player("Joe", "safari"));
        cardGamesMock.players.add(new Player("Jo", "safar"));


    }

    @Test
    public void initializeCardPlayersTest(){
        Assert.assertEquals("Should return 4", 4, cardGamesMock.players.size());
    }

    @Test
    public void dealTest(){
        cardGamesMock.deal(2);
        CardPlayer samplePlayer = cardGamesMock.cardPlayers.get(0);
        Assert.assertEquals("Should return 2", 2, cardGamesMock.getGameTable().get(samplePlayer).size());
    }

}
