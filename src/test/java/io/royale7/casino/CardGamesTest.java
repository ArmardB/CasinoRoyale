package io.royale7.casino;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class CardGamesTest {
    CardGamesMock cardGamesMock;


    private class CardGamesMock extends CardGames{

        protected List<CardPlayer> cardPlayers;
        protected HashMap<CardPlayer,List<Card>> gameTable;

        public CardGamesMock(List<Player> players) {
            super(players);
        }

        public List<CardPlayer> getCardPlayers(){
            this.cardPlayers = super.cardPlayers;
            return cardPlayers;
        }

        public HashMap<CardPlayer,List<Card>> getGameTable(){
            this.gameTable = super.gameTable;
            return gameTable;
        }
        public void init(){}
    }
    @Before
    public void initialize(){
        List<Player> playerList = new ArrayList<>();
        playerList.add(new Player("Bob", "zoo"));
        playerList.add(new Player("Bill", "aquarium"));
        playerList.add(new Player("Joe", "safari"));

        cardGamesMock = new CardGamesMock(playerList);
    }

    @Test
    public void initializeCardPlayersTest(){
        Assert.assertEquals("Should return 4", 4, cardGamesMock.getCardPlayers().size());
    }

    @Test
    public void dealTest(){
        cardGamesMock.deal(2);
        CardPlayer samplePlayer = cardGamesMock.getCardPlayers().get(1);
        Assert.assertEquals("Should return 2", 2, cardGamesMock.getGameTable().get(samplePlayer).size());
    }

}

