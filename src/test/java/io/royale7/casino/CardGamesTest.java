package io.royale7.casino;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class CardGamesTest {
    CardGamesMock cardGamesMock;
    GameMock gameMock;



    private class CardGamesMock extends CardGames{

        List<CardPlayer> cardPlayers;
        List<Player> samplePlayers;
        HashMap<CardPlayer,List<Card>> gameTable;

        public CardGamesMock() {

        }

        public List<CardPlayer> getCardPlayers(){
            this.cardPlayers = super.cardPlayers;
            return cardPlayers;
        }


        public HashMap<CardPlayer,List<Card>> getGameTable(){
            this.gameTable = super.gameTable;
            return gameTable;
        }
        @Override
        public void init(){}
    }

    private class GameMock extends Game{
        List<Player> players;

        public List<Player> getSamplePLayers(){
            this.players = super.playersContainer;
            return players;
        }

        @Override
        public void settle(){}

        @Override
        public void bet(){}

        @Override
        public void init(){}
    }
    @Before
    public void initialize(){
        List<Player> samplePlayerList = new ArrayList<>();

        samplePlayerList.add(new Player("Joe", "zoo"));
        samplePlayerList.add(new Player("Bob", "zoo"));
        samplePlayerList.add(new Player("Billy", "zoo"));

        gameMock = new GameMock();
        gameMock.setPlayersContainer(samplePlayerList);
        cardGamesMock = new CardGamesMock();
    }

    @Test
    public void initializeCardPlayersTest(){
        Assert.assertEquals("Should return 4", 4, cardGamesMock.getCardPlayers().size());
    }

    @Test
    public void dealTest(){
        cardGamesMock.deal(2);
        CardPlayer samplePlayer = cardGamesMock.cardPlayers.get(1);
        Assert.assertEquals("Should return 2", 2, cardGamesMock.getGameTable().get(samplePlayer).size());
    }


}
