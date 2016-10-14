package io.royale7.casino;

import org.junit.Before;
import org.junit.Test;

/**
 * Created by nazhirjackson on 10/13/16.
 */
public class HorseRacingTest {

    HorseRacing horseys;
    @Before
    public void initialize(){
       horseys = new HorseRacing();
    }

    @Test
    public void anotherSanityTest() {
        for(int i = 0; i < 5; i++ ){
           HorseRacing.Horse horsey = horseys.createHorse("YoMamma"+i , "50");
            horseys.putHorsesOnTrack(horsey);
            System.out.println(horseys.getHorseTrack().get(i).toString());
        }
    }
}
