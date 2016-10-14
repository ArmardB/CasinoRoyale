package io.royale7.casino;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

/**
 * Created by nazhirjackson on 10/13/16.
 */
public class HorseRacingTest {

    HorseRacing horseys;
    Player player = new Player();
    List<Player> playerList = new ArrayList<>();
    @Before
    public void initialize(){
        playerList.add(player);
       horseys = new HorseRacing(playerList);
        horseys.putHorsesOnTrack();
    }

    @Test
    public void anotherSanityTest() {
        for(int i = 0; i < 5; i++ ){
            System.out.println(horseys.getHorseTrack().get(i).toString());
        }
    }

    @Test
    public void shufflingPositionsTest() {
        
    }

    @Test
    public void resultTest() {
        String expected = horseys.horsesTrack.get(1).toString();
        String actual = horseys.result().toString();

        assertEquals(expected, actual);
    }

}
